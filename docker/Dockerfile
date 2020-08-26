# Usa o sistema operacional Debian como base
FROM ubuntu:14.04

# Adiciona uma variável para facilitar a alteração de versões futuras
ENV JAVA_VERSION 14.0.2
# E adiciona a variável de ambiente JAVA_HOME
ENV JAVA_HOME /usr/java/jdk-14.0.2/

# Copia o arquivo do Java para dentro do container
COPY jdk-$JAVA_VERSION\_linux-x64.tar.gz /usr/lib/jvm/

# Acessa a pasta onde o Java será instalado:
WORKDIR /usr/lib/jvm

# Descompacta o Java e remove o arquivo zipado:
RUN tar -zxvf jdk-$JAVA_VERSION\_linux-x64.tar.gz && \
    rm jdk-$JAVA_VERSION\_linux-x64.tar.gz

# Adiciona o Java no PATH
ENV PATH "$PATH":/${JAVA_HOME}/bin:.:

