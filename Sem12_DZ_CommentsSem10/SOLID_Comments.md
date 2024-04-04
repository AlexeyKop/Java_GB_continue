## Cоответствие принципам SOLID:

1. Принцип единственной ответственности (Single Responsibility Principle)
Подходящие участки кода:
Класс _User_ содержит только методы для работы с данными пользователя (get, set, equals, toString). 
Это соответствует принципу SRP, т.к. класс занимается только управлением данными одного пользователя.
Класс _UserComparator_ и метод _compare_ в нем. Он отвечает только за сравнение пользователей по их ФИО, 
что соответствует принципу SRP.
Класс _StudentService_ и _TeacherService_ отвечают за создание студентов и учителей, а также хранение их в коллекции. 
Это тоже соответствует SRP, так как классы отвечают только за управление данными студентов и учителей.
2. Принцип открытости/закрытости (Open/Closed Principle)
Подходящие участки кода:
Класс _Student_ реализует интерфейс _Comparable_, что позволяет его объектам быть сравниваемыми с помощью метода 
_compareTo_. Это соответствует принципу OCP, т.к. класс открыт для расширения (реализация интерфейса), 
но закрыт для изменения.
Класс _UserComparator_ также реализует интерфейс _Comparator_, что позволяет сравнивать объекты пользователей 
по различным критериям. Это тоже соответствует принципу OCP, т.к. добавление новых способов сравнения 
не требует изменения класса.
3. Принцип подстановки Барбары Лисков (Liskov Substitution Principle)
Подходящие участки кода:
Класс _Student_ является подклассом _User_ и добавляет свои собственные поля и методы. 
Он также реализует интерфейс _Comparable_, что позволяет его объектам быть использованными вместо объектов User везде,
где ожидается _Comparable_. Это соответствует принципу LSP, т.к. подклассы могут заменять своих суперклассов 
без изменения ожидаемого поведения программы.
4. Принцип инверсии зависимостей (Dependency Inversion Principle)
Подходящие участки кода:
Интерфейсы _UserController_ и _UserService_ используются для взаимодействия с контроллерами и сервисами
без привязки к конкретным реализациям. Это соответствует принципу DIP, т.к. высокоуровневые модули (контроллеры)
зависят от абстракций (интерфейсов), а не от конкретных классов.
5. Принцип разделения интерфейса (Interface Segregation Principle)
Применения в данном коде:
В данном коде интерфейсы _(UserController, UserService, UserView)_ довольно маленькие и специфичные 
для своих классов, поэтому здесь не очень видны примеры нарушения или соответствия ISP.