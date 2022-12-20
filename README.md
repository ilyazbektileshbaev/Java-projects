Java Project


                      Техническое задание на разработку «Инвентаризации оборудовании в университета»

  Введение

  Работа выполняется для облегчения учета оборудования университета. За инвентаризацией следят несколько человек в школе и им необходима такого рода программа. Среди этих людей это: Директор, Завхоз, Доставщик:

                                               1. Назначение разработки
  Инвентаризация в университете (здесь название образовательного учреждения можете дать сами)» предназначена для обобщения информации об оборудований в образовательном учреждении, о количестве стульев, о количестве парт, о количество досок, о количестве компьютеров, проекторов и т.д.
  Пользователями программы являются директор школы, завхоз. У каждого будет свой доступ к системе по логин и паролю. 
    - Для директора, к примеру логин: "director" и пароль «pa$$wOrd123» (Или на свое усмотрение можете установить)
    - Для завхоза, к примеру логин: "zavkhoz" и пароль «zavkhoz123»(Или на свое усмотрение можете установить) 
    - Для доставщика, к примеру логин «delivery» и пароль «delivery123» (Или на свое усмотрение можете установить)

  Логин и пароли могут быть считаны из файла и пройти проверку в условных конструкциях. 
  
  В зависимости от категории аккаунта того или иного человека, открывается соответствующее меню.

  Общая информация о количестве парт, стульев, проектов и других оборудований вместе с отчетностью доступна завхозу

  Доставщик имеет возможность видеть отчетность сколько оборудований было доставлено, и в зависимости от количества оборудований и техник программа автоматически подсчитывает цены за доставки.

  Директор же может удалять со своего списка т.е. с файла об оборудовании имя оборудования для закупок или может добавить оборудование. Кроме этого, директору доступна информация о поставщиках, отчетах об оборудовании, движениях денежных средств, недостаче и информация о переизбытке.

                                                              
                                                              2. Требования к программе

  2.1. Требования к функциональным характеристикам Автоматизированная информационная система «Образовательный Центр» должна обеспечивать выполнение функций:

• Вход в аккаунт 
• Возможность выбрать из меню исходя от типа аккаунта человека
• Возможность поиска оборудования по серийному номеру, по имени оборудования 
• Возможность видеть цену, дату закупок и многое другое

  Нормативно-справочная информация автоматизированной информационной системы »Инвентаризация оборудования» представлена в виде справочника для всех типов аккаунтов в виде одного из пунктов меню, при нажатии на которую отображается длинный текст в виде инструкции.

  2.2. Сценарий работоспособности программы

  Аккаунт Завхоз

    1. Запускается программа и предлагает первым делом вести тип аккаунта и набрать ключевое слово.
       Пример:
       
       Для запуска программы, пожалуйста введите тип аккаунта: >>>
  
  Zavkhoz

       В случае если не совпадает название типа аккаунта, программа завершается со словами:

       Извините, но мы не нашли такой тип аккаунта, пожалуйста повторите.

    2. Затем предлагается вести логин и пароль и после успешной авторизации, открывается меню для завхоза.

      Пример меню для завхоза выглядит следующим образом:

      Приветствую дорогой, Завхоз
      Пожалуйста наберите номер меню для работы с программой, если закончили, то наберите 8. 
        
        1. Показать весь список оборудований для школы
        2. Искать оборудования: 
         • По серийному номеру
            • Напишите серийный номер для поиска (После чего выводится список оборудования по серийному номеру).

         • По названию.
            • Напишите имя оборудования для поиска (После чего выводится список оборудования)

        3. Показать отчет по оборудованиям (Показывает весь список оборудований, который доступен с указанием количества и года когда было приобретено) 
        4. Выполнить заказ оборудований:
          • Пожалуйста напишите какое оборудование вы бы хотели заказать. (Здесь указывается название оборудования для заказа, после чего это указанное название оборудования записывается в отдельный файл «Заказанное оборудование») 
        5. Посмотреть список заказанного оборудование (Показывает весь список заказанного оборудование из файла «Заказанное оборудование»)
        6. Удалить заказ: 
        7. Какое оборудование вы бы хотели удалить? >>> (Удаляет оборудование из файла заказанное оборудование»)
        8. Выход
    
    Выбор меню: >>

      В случае если, выбирается опция «Выхода», то программа завершается со словами: Программа завершена, мы будем рады вашему возвращению!

Аккаунт Доставщик:

    1. Запускается программа и предлагает первым делом вести тип аккаунта и набрать ключевое слово.
      Пример:
      
      Для запуска программы, пожалуйста введите тип аккаунта: >>>

  Deliveryman

      В случае если не совпадает название типа аккаунта, программа завершается со словами:

      Извините, но мы не нашли такой тип аккаунта, пожалуйста повторите.

     2. Затем предлагается вести логин и пароль и после успешной авторизации, открывается меню для доставщика.

      Пример меню для доставщика выглядит следующим образом:

      Приветствую дорогой, Доставщик! 
      Пожалуйста наберите номер меню для работы с программой, если закончили, то наберите 7:

      1. Показать список оборудований для доставки (Показывает список оборудований для доставки из файла заказанное оборудование»)

      2. Показать доставленные оборудования (Показывает список доставленных оборудований из файла Доставленные оборудования»)

      3. Доставить оборудование. 
        • Какое оборудование было доставлено? Введите название оборудование или его серийный номер (В файл заносится название или серийный номер оборудования, которое было написано доставщиком и одновременно удаляется запись этого оборудования из файла «Заказанное оборудование»)

      4. Показать количество доставленных оборудований: (Показывает количество доставленных оборудований из файла «Доставленное оборудование»)

      5. Показать количество заказанных оборудований (Показывает количество оборудований для Доставки из Заказанное оборудование») 
      
      6. Показать мой заработок (Показывает сколько он получил за каждое оборудование из файла <<Доставленное оборудовани>>, ставку за доставку можно будет установить на свое рассмотрение) 
      
      7. Выход (Выходит из программы)

      Выбор меню >>>

      В случае если, выбирается опция «Выхода», то программа завершается со словами: Программа завершена, мы будем рады вашему возвращению!

Аккаунт Директор

          1. Запускается программа и предлагает первым делом вести тип аккаунта и набрать ключевое слово..

          Пример:

          Для запуска программы, пожалуйста введите тип аккаунта: >>>

     Director

          В случае, не совпадает название типа аккаунта, программа завершается со словами:

          Извините, но мы не нашли такой тип аккаунта, пожалуйста повторите.

          3. Затем предлагается вести логин и пароль и после успешной авторизации, открывается меню для директора.

          Пример меню для директора выглядит следующим образом:

          Приветствую дорогой, Директор! 
          Пожалуйста наберите номер меню для работы с программой, если закончили, то наберите 8:

          1. Показать список оборудований (Показывает список оборудований, который есть в образовательном центре) 2. Показать количество оборудований (Показывает количество оборудование по категории)

          3. Показать оборудование с самым максимальным количеством

          4. Показать оборудование с самым минимальным количеством 5. Показать отчет по закупкам об оборудовании

          6. Выход (выходит из программы)

          Выбор меню >>>

          В случае если, выбирается опция «Выхода», то программа завершается со словами: Программа завершена, мы будем рады вашему возвращению!

          Программа должна быть написано с помощью языка Python и все операции записи и удаления должны производится с помощью записи в файл, чтение из файла и операции над ними.
