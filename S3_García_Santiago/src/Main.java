public class Main {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona("Alberto", 43, 'M', "Cantar y bailar");
        
        System.out.println("Cambios para el pull request");
        
        System.out.println("Ingrese datos: ");
        try{
            p1.ingresar();
            } catch (Exception e){
            System.out.println("Se ha detectado un error");
            System.out.println(e.getMessage());
        }
        System.out.println("---Persona 1---");
        p1.mostrar();
        
        System.out.println("---Persona 2---");
        p2.setNombre("Diego");
        p2.setEdad(33);
        p2.setSexo('M');
        p2.setIntereses("Programas y estudiar");
        p2.mostrar();
        System.out.println("---Persona 3---");
        p3.mostrar();

        System.out.println("Total de personas creadas: " + Persona.getContador());

    }

}

