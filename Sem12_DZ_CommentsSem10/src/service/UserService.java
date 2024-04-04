package service;

import data.User;

import java.time.LocalDate;
import java.util.List;

// UserService<T> в пакете service
// Этот интерфейс отвечает за общую функциональность сервисов для работы с пользователями (getAll и create).
// Это соответствует принципу SRP, так как интерфейс имеет одну причину для изменений - работу с пользователями.
// UserService реализован в классах TeacherService и StudentService в соответствующих пакетах service.
// Каждый из этих классов реализует функциональность для работы с конкретным типом пользователей
// (учителями и студентами).
// Это также соответствует принципу SRP, так как каждый класс имеет одну причину для изменения - работу
// с соответствующим типом пользователей.

public interface UserService<T extends User> {
    List<T> getAll();
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
