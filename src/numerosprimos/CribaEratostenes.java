/**
 * Clase para generar todos los números primos de 1 hasta
 * un número máximo especificado por el usuario. Como 
 * algoritmo se utiliza la criba de Eratóstenes.
 * 
 * Eratóstenes de Cirene (276 a.C., Cirene, Libia – 194
 * a.C., Alejandría, Egipto) fue el primer hombre que 
 * calculó la circunferencia de la Tierra. También
 * se le conoce por su trabajo con calendarios que ya 
 * incluían años bisiestos y por dirigir la mítica 
 * biblioteca de Alejandría.
 * 
 * El algoritmo es bastante simple: Dado un vector de
 * enteros empezando en 2, se tachan todos los múltiplos
 * de 2. A continuación, se encuentra el siguiente
 * entero no tachado y se tachan todos sus múltiplos. El 
 * proceso se repite hasta que se pasa de la raíz cuadrada
 * del valor máximo. Todos los números que queden sin 
 * tachar son números primos.
 */ 

package numerosprimos;    
    
public class CribaEratostenes { 
    /** 
    * Generar números primos de 1 a max
    * @param max es el valor máximo
    * @return Vector de números primos
    */
    public static int[] generarPrimos (int max) { 
        int dim;
        int cuenta = 0;
        int [] primos;
        boolean[] esPrimo;
        
        if (max >= 2) {

            // Declaraciones
            dim = max + 1; // Tamaño del array 
            esPrimo = new boolean[dim]; 

            // Inicializar el array
            for (int i = 0; i < dim; i++) {
                esPrimo[i] = true;
            }

            // Eliminar el 0 y el 1, que no son primos
            esPrimo[0] = esPrimo[1] = false; 

            // Criba
            Criba(dim, esPrimo);

            // ¿Cuántos primos hay? 
            cuenta = contarPrimos(dim, esPrimo);

            // Rellenar el vector de números primos
            primos = new int[cuenta];
            rellenarVector(primos, dim, esPrimo);

            return primos; 

        } else { // max < 2 
            return new int[0]; // Vector vacío
        }    
    }
    
    //<editor-fold desc="MÉTODOS" defaultstate="collapsed">
    public static void Criba(int dim, boolean[] esPrimo) {
        
        for (int i = 2; i < Math.sqrt(dim) + 1; i++) { 
            if (esPrimo[i]) {
                // Eliminar los múltiplos de i
                for (int j = 2*i ; j < dim ; j+=i) { 
                esPrimo[j] = false;
                }
            } 
        }
    }
    
    public static int contarPrimos(int dim, boolean[] esPrimo) {
        int cuenta = 0;
        for (int i = 0; i < dim; i++) { 
            if (esPrimo[i]) {
                cuenta++; 
            }
        }
        return cuenta;
    }
    
    public static int[] rellenarVector(int[] primos, int dim, boolean[] esPrimo) {
        for (int i = 0, j = 0; i < dim; i++) { 
            if (esPrimo[i]) {
                primos[j++] = i;
            }
        }
        
        return primos;
    }
    //</editor-fold>
}







