import java.util.Scanner;

public class Persona {

    private String nombre;
    private int edad;
    private char sexo;
    private String intereses;
    private static int contador;

    public Persona() {
        contador++;
    }

    public Persona(String nombre, int edad, char sexo, String intereses) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.intereses = intereses;
        contador++;
    }

    Scanner teclado = new Scanner(System.in);

    public static int getContador() {
        return contador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().length() == 0) {
            this.nombre = "unknown";
        } else {
            this.nombre = nombre;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        if (edad > 100) {
            this.edad = 0;
        } else {
            this.edad = edad;
        }
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        sexo = Character.toUpperCase(sexo);
        if (sexo == 'M' || sexo == 'F') {
            this.sexo = sexo;
        } else {
            this.sexo = 'X';
        }
    }

    public String getIntereses() {
        return intereses;
    }

    public void setIntereses(String intereses) {
        if (intereses == null || intereses.trim().length() == 0) {
            this.intereses = "unknown";
        } else {
            this.intereses = intereses;
        }
    }

    public void ingresar() {
        System.out.print("Ing. Nombre: ");
        setNombre(teclado.nextLine());

        System.out.print("Ing. Edad: ");
        setEdad(teclado.nextInt());
        teclado.nextLine();

        System.out.print("Ing. Sexo (M/F): ");
        setSexo(teclado.nextLine().charAt(0));

        System.out.print("Ing. Intereses: ");
        setIntereses(teclado.nextLine());
    }

    public void mostrar() {
        System.out.println("- Nombre: " + this.nombre);
        System.out.println("- Edad: " + this.edad);
        System.out.println("- Sexo: " + this.sexo);
        System.out.println("- Intereses: " + this.intereses);
    }
}
