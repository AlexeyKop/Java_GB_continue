package ISP;
// Принцип разделения интерфейса (Interface Segregation Principle)

// интерфейс Shape описывает методы для наших фигур
public interface Shape {
    double perimetr();
//    // добавим метод по поиску объёма
//    // у 2D фигур (типа круг) нет объема, поэтому создаем ещё один интерфейс Shape3D и переносим туда
//    double volume ();
}
