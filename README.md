# TestForEGRZ_PES

Home_Exercise

Задание_2. Разворачиваем приложение на linux, мы в home/dev.

Используемые технологии: JRE, Git, Maven, Docker.

1. Набираем pwd в терминале чтобы удостовериться, что мы в Home/dev.
2. Проверяем версию Java в системе, если нет или меньше чем нам нужно устанавливаем.
3. Устанавливаем GIt, Maven и клиент Docker, если нет.
4. Создаем в Home/dev каталог нашего приложения mkdir usSpringBoot и переходим в него cd usSpringBoot.
5. Клонируем образец проекта Spring Boot on Docker в наш каталог git clone https://github.com/spring-guides/gs-spring-boot-docker.git.
6. Переходим в каталог готового проекта  cd gs-spring-boot-docker/complete.
7. Выполняем сборку исполняемого *JAR файла с помощью Maven.
8. Переходим в каталог target нашего приложения и запускаем само приложение cd target java -jar spring-boot-docker-complete-0.0.1-SNAPSHOT.jar —server.port=80
9.Проверяем Web-приложение, для этого понадобится браузер, заходим и проверяем Tomcat на порту, который установили(80).
10 .Приложение уже должно развернуться и работать.
