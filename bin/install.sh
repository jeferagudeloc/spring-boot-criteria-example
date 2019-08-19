# ACTUALIZACION REPOSITORIOS
sudo apt-get update

# INSTALACION DE EDITORES DE TEXTO
sudo apt-get install vim gedit-developer-plugin gedit-common gedit-plugins gedit-source-code-browser-plugin gedit-dev

# INSTALACION DE CONTROL DE VERSIONES
sudo apt-get install meld git

# INSTALACION DE AMBIENTE DOCKER
sudo apt-get install -y docker docker-compose curl
sudo apt-get install -y apt-transport-https ca-certificates
sudo apt-key adv --keyserver hkp://ha.pool.sks-keyservers.net:80 --recv-keys 58118E89F3A912897C070ADBF76221572C52609D

sudo chmod -R 777 /etc/apt/sources.list.d/
echo "deb https://apt.dockerproject.org/repo ubuntu-xenial main" >> /etc/apt/sources.list.d/docker.list

sudo apt-get update
sudo apt-cache policy docker-engine
sudo apt-get install -y linux-image-extra-$(uname -r) linux-image-extra-virtual
sudo apt-get install -y docker-engine
sudo apt upgrade

sudo curl -L "https://github.com/docker/compose/releases/download/1.21.0/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose
sudo chmod +x /usr/local/bin/docker-compose

sudo chmod -R 777 /etc/bash_completion.d/
curl -L https://raw.githubusercontent.com/docker/compose/$(docker-compose version --short)/contrib/completion/bash/docker-compose > /etc/bash_completion.d/docker-compose

# INSTALACION HERRAMIENTAS TOOLS
sudo apt-get install mysql-workbench
