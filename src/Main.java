public class Main {
    public static void main(String[] args) {
        System.out.println("¡Bienvenidos a la inmersión en Java!");
        // System.out.println("Película Matrix");
        // Declaración de variables.
        int fechaDeLanzamiento;
        fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico;
        incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                El programador informático Thomas Anderson, 
                más conocido en el mundo de los "hacker" como Neo, 
                está en el punto de mira del temible agente Smith. 
                Otros dos piratas informáticos, Trinity y Morfeo, se ponen en contacto con Neo para ayudarlo a escapar. 
                Matrix te posee. Sigue al conejo blanco.
                """;

        System.out.println("Película: " + nombre);
        System.out.println("Fecha: " + fechaDeLanzamiento);
        System.out.println("Puntaje: " + evaluacion);
        System.out.println("Plan:" + incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;

    }
}