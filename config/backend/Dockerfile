FROM maven:3.5.3-jdk-8

RUN apt-get update && apt-get install -y inotify-tools psmisc

RUN groupadd -g 1000 maven

RUN useradd -m -u 1000 -g 1000 maven

RUN mkdir /home/maven/.m2

RUN chmod -R 777 /home/maven/.m2

COPY entrypoint.sh /bin/entrypoint.sh

RUN chmod 777 /bin/entrypoint.sh

RUN mkdir /var/logs

RUN chmod -R 777 /var/logs

USER maven

WORKDIR /usr/src/project

ENTRYPOINT /bin/entrypoint.sh
