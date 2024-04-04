package data;

import java.util.Comparator;

// UserComparator<T> в пакете data
// Этот класс реализует сравнение пользователей (в данном случае студентов) и используется для сортировки.
// Он реализует интерфейс Comparator<T> и может быть использован в любом месте кода,
// где требуется сравнение студентов.
// Если потребуется добавить новые методы сравнения или изменить логику сравнения,
// это можно сделать без изменения самого класса Student или других частей кода.
// Это соответствует принципу OCP - класс открыт для расширения новыми методами сравнения,
// но закрыт для изменения существующей логики сравнения.

public class UserComparator<T extends User> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
            if (resultOfComparing == 0) {
                return o1.getPatronymic().compareTo(o2.getPatronymic());
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing;
        }
    }
}
