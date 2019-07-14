CREATE TABLE "Водители" (
                            "Табельный номер" varchar(10000) NOT NULL,
                            "Имя" varchar(10000) NOT NULL,
                            "Фамилия" varchar(10000) NOT NULL,
                            "Отчество" varchar(10000) NOT NULL,
                            "Дата рождения" varchar(100000) NOT NULL,
                            CONSTRAINT "Водители_pk" PRIMARY KEY ("Табельный номер")
) WITH (
      OIDS=FALSE
    );



CREATE TABLE "Автомобили" (
                              "Гаражный номер" varchar(5000) NOT NULL,
                              "Марка" varchar(5000) NOT NULL,
                              "Модель" varchar(5000) NOT NULL,
                              "Дата выпуска" varchar(5000) NOT NULL,
                              "Пробег" varchar(5000) NOT NULL,
                              CONSTRAINT "Автомобили_pk" PRIMARY KEY ("Гаражный номер")
) WITH (
      OIDS=FALSE
    );



CREATE TABLE "Поездки" (
                           "ID поездки" varchar(100000) NOT NULL,
                           "Дата" varchar(1000000) NOT NULL,
                           "Время" varchar(1000000) NOT NULL,
                           "Пункт отправления" varchar(1000000) NOT NULL,
                           "Пункт назначения" varchar(1000000) NOT NULL,
                           "Стоимость" varchar(1000000) NOT NULL,
                           CONSTRAINT "Поездки_pk" PRIMARY KEY ("ID поездки")
) WITH (
      OIDS=FALSE
    );



CREATE TABLE "Клиент" (
                          "ID клиента" varchar(1000000) NOT NULL,
                          "Фамилия" varchar(1000000) NOT NULL,
                          "Имя" varchar(1000000) NOT NULL,
                          "Отчество" varchar(1000000) NOT NULL,
                          "Дата поездки" varchar(1000000) NOT NULL,
                          CONSTRAINT "Клиент_pk" PRIMARY KEY ("ID клиента")
) WITH (
      OIDS=FALSE
    );



ALTER TABLE "Водители" ADD CONSTRAINT "Водители_fk0" FOREIGN KEY ("Табельный номер") REFERENCES "Автомобили"("Гаражный номер");

ALTER TABLE "Автомобили" ADD CONSTRAINT "Автомобили_fk0" FOREIGN KEY ("Гаражный номер") REFERENCES "Поездки"("ID поездки");

ALTER TABLE "Поездки" ADD CONSTRAINT "Поездки_fk0" FOREIGN KEY ("ID поездки") REFERENCES "Водители"("Табельный номер");

ALTER TABLE "Клиент" ADD CONSTRAINT "Клиент_fk0" FOREIGN KEY ("ID клиента") REFERENCES "Поездки"("ID поездки");
