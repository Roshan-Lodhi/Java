class text {

    public static void main(String[] args) {
   
        Animal animal = new Dog(); // Late binding
        animal.sound(); // Calls Dog's sound method at runtime

    }
}
        
        class Animal {
            void sound() {
                System.out.println("Animal makes a sound");
            }
        }
        
        class Dog extends Animal {
            void sound() {
                System.out.println("Dog barks");
            }
        }
        
      
     


        
    
    

