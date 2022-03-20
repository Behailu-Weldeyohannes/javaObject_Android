package OutstandinglyDigital.company;

public class Android {
    private String SmartPhoneName;  //private Keyword-accessible within the declared class
    private String Manufacturer;
    private String Model;
    private String OperatingSys;
    private String Memory;
    private String Color;
    private String CameraLenses;
    private double Price;
    private String Battery;

    public Android(String SmartPhoneName, String Manufacturer, String Model, String OperatingSys, String Memory, String Color, String CameraLenses, double Price, String Battery) {
        this.SmartPhoneName = SmartPhoneName; // current object in a method or constructor.
        this.Manufacturer = Manufacturer;
        this.Model = Model;
        this.OperatingSys = OperatingSys;
        this.Memory = Memory;
        this.Color = Color;
        this.CameraLenses = CameraLenses;
        this.Price = Price;
        this.Battery = Battery;
        System.out.println("Smart Phone name: " + SmartPhoneName + "\nManufacturer: " + Manufacturer +
                "\nModel: " + Model + "\nOperatingSystem: "
                + OperatingSys + "\nColor: " + Color + "\nMemory: " + Memory + "\nCamera: " + CameraLenses + "\nPrice: " + "$" + Price + "\nBattery: " + Battery);
    }

    ;
    // create methods


    // create getter and setter

}
