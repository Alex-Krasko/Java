package Arch_PO;
public class ModelElements {
    
}

class PoligonalModel {
    public Poligon Poligons;
    public Texture Textures;
}

class Poligon {
   public Point3D Points = new Point3D();
}

class Texture {

}

class Flash {
    public Point3D Location; // создание переменных
    public Angle3D Angle;    //
    public Color Color;      //
    public Float Power;      //

    public void Rotate(Angle3D ang) { // Вращение объекта на ang 

    }

    public void Move(Point3D dot) { // Перемещение(движение) объекта на позицию dot

    }
}

class Camera {
    public Point3D Location;
    public Angle3D Angle;

    public void Rotate() {

    }

    public void Move() {

    }
}

class Scene {
    public int id;
    public PoligonalModel Models;
    public Flash Flashes;

    public Type Method1(Type t) {
        return t;
    }

    public Type Method2(Type t1, Type t2) {
        return t2;
    }
}

class Point3D {

}

class Angle3D {

}

class Color {

}

class Type {

}