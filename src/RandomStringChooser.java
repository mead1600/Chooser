public class RandomStringChooser {

    private String[] arrays;

    public RandomStringChooser(String[] arrays){
        this.arrays = arrays;
    }

    public String getNext(){
        int index = (int)(Math.random()*this.arrays.length);
        String currentString = "";
        if(this.arrays[index] == null){
            return "NONE";
        }

    }
}
