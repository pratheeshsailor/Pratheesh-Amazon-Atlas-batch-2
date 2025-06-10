class Students{
    public String name;
    Students(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}

public class task024{
    public static void main (String[] args){

        // declares an Array and initializing the
        // elements of the array
        Students[] myStudents = new Students[]{
                new Students("Dharma"),new Students("sanvi"),
                new Students("Rupa"),new Students("Ajay")
        };
        // accessing the elements of the specified array
        for(Students m:myStudents){
            System.out.println(m);
        }
    }
}
