wait_changes(){
    inotifywait -e create -e modify -e move -e delete -r /usr/src/project/src/main/
    echo "================================="
    echo "CAMBIO DETECTADO"
    echo "================================="
    stop_mvn
    sleep 3
    run_mvn
}

stop_mvn(){
    {
        fuser -k 8000/tcp || fuser -k 8080/tcp || echo "MAVEN se ha detenido"
    } || {
        echo "MAVEN no estaba ejecutandose"
    }
}

run_mvn(){
    ERROR=0
    mvn -T 100 clean install -l /var/logs/maven.log || ERROR=1
    if [ $ERROR -eq 0 ]
    then
        {
            echo "MAVEN clean install / PROYECTO COMPILADO"
            sleep 1
            mvn -T 100 spring-boot:run -Dspring-boot.run.jvmArguments="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=8000" -l /var/logs/maven.log || echo "MAVEN run / ERROR DURANTE LA EJECUCION"
        } & {
            echo "ESPERANDO NUEVOS CAMBIOS"
            sleep 1
            wait_changes
        }
    else
        echo "MAVEN clean install / ERROR AL COMPILAR EL PROYECTO"
        echo "ESPERANDO NUEVOS CAMBIOS"
        sleep 1
        wait_changes
    fi
}

run_mvn
