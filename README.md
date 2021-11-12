# TestForEGRZ_PES

Home_Exercise

Задание_2. Разворачиваем приложение на linux, мы в home/dev.

Используемые технологии: JRE, Git, Maven, Docker.

Набираем pwd в терминале чтобы удостовериться, что мы в Home/dev.
Проверяем версию Java в системе, если нет или меньше чем нам нужно устанавливаем.
Устанавливаем GIt, Maven и клиент Docker.
Создаем в Home/dev каталог нашего приложения mkdir usSpringBoot и переходим в него cd usSpringBoot.
Клонируем образец проекта Spring Boot on Docker в наш каталог git clone https://github.com/spring-guides/gs-spring-boot-docker.git.
Переходим в каталог готового проекта  cd gs-spring-boot-docker/complete.
Выполняем сборку исполняемого *JAR файла с помощью Maven.
Переходим в каталог target нашего приложения и запускаем само приложение cd target java -jar spring-boot-docker-complete-0.0.1-SNAPSHOT.jar —server.port=80
Проверяем Web-приложение, для этого понадобится браузер, заходим и проверяем Tomcat на порту, который установили(80).
Приложение уже должно развернуться и работать.