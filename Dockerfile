FROM library/java

WORKDIR /home/apps/
ADD target/csespringmvc-0.0.1-SNAPSHOT.jar .

ADD start.sh .

ENTRYPOINT ["sh", "/home/apps/start.sh"]
