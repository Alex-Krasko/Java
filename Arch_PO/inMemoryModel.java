package Arch_PO;
//import Arch_PO.ModelElements;

public class inMemoryModel {
    
}

class ModelStore {
    public PoligonalModel Models;
    public Scene Scenes;
    public Flash Flashes;
    public Camera Cameras;
    private IModelChangeObserver changeObservers;

    public Scene GetScene(int i) {
        return Scenes;
    }

    public void NotifyChange(IModelChanger m) {

    }
}

interface IModelChangeObserver {
    public static void ApplyUpdateModel() {

    }
}

interface IModelChanger {
    public static void NotifyChange(IModelChanger sender) {

    }
}