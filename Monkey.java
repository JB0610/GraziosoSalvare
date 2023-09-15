public class Monkey extends RescueAnimal {
    private String tailLength;
    private String monkeyHeight;
    private String bodyLength;
    private String monkeySpecies;

    public Monkey(String name, String gender, String age, String weight, String acquisitionDate, String acquisitionCountry, String trainingStatus, boolean reserved, String inServiceCountry, String tailLength, String monkeyHeight, String bodyLength, String monkeySpecies) {

        // RescueAnimal methods
        setName(name);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);

        // Monkey methods
        setTailLength(tailLength);
        setMonkeyHeight(monkeyHeight);
        setBodyLength(bodyLength);
        setMonkeySpecies(monkeySpecies);
    }

    // Getters
    public String getTailLength() {
        return tailLength;
    }

    public String getMonkeyHeight() {
        return monkeyHeight;
    }

    public String getBodyLength() {
        return bodyLength;
    }

    public String getMonkeySpecies() {
        return monkeySpecies;
    }

    // Setters
    public void setTailLength(String tailLength) {
        this.tailLength = tailLength;
    }

    public void setMonkeyHeight(String monkeyHeight) {
        this.monkeyHeight = monkeyHeight;
    }

    public void setBodyLength(String bodyLength) {
        this.bodyLength = bodyLength;
    }

    public void setMonkeySpecies(String monkeySpecies) {
        this.monkeySpecies = monkeySpecies;
    }
}
