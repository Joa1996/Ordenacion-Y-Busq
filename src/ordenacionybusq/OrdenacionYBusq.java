
package ordenacionybusq;
/*Cuando almacenamos datos en alguna estructura de datos, luego es necesario recuperar esta informacion para entre otras cosas poder trabajarla, para ello
estan los algoritmos de ordenacion y busqueda, La ordenación (en inglés sorting)  y la búsqueda (en inglés searching) proveen un medio para la organización de la información, 
facilitando de esta manera, la recuperación de datos específicos. Debido a la importancia de estas operaciones, se han desarrollado una gran variedad de algoritmos para tratarlas,ntercambio, selección, inserción y burbuja,
que son algoritmos sencillos de uso frecuente y que se muestran eficientes en listas  pequeñas. Sin embargo,en listas grandes estos métodos se muestran ineficaces y es
preciso recurrir a métodos avanzados como el Shell, la ordenación rápida  o  la ordenación por mezcla.*/

public class OrdenacionYBusq {

  
    public static void main(String[] args) 
    {
 //Algoritmo de ordenacion "Ordenacion por Intercambio"
/*El algoritmo de ordenación de intercambio, puede ordenar los elementos de una lista en orden ascendente o descendente. El
algoritmo se basa en la lectura sucesiva de la lista a ordenar, comparando el elemento
inferior de la lista con los restantes y efectuando intercambio de posiciones cuando el
orden resultante de la comparación no sea el correcto, es decir compara el menor elemento de la lista con cada uno de los restantes, y si corresponde
realiza el intercambio poniendo este elemento a la primera posicion*/
int Array1[]={3,2,100,3,5};//Ddeclaramos un Array aleatorio todo desordenado
//Procedemos a ordenarlo de forma descendente
int i,j;
int n=Array1.length;
//n representa el tamaño del array
for(i=0;i<=n-2;i++)//i se incrementa hasta la posicion n-2 del array, es este caso hasta la posicion 2
    for(j=i+1;j<=n-1;j++)//j vale lo mismo que la posicion de i actualmente mas 1, desde este valor se empieza incrementar j hasta llegar a a la posicion n-1 del array, en este caso j vale 3 y se incrementara hasta la posicion 3
        //La idea de los 2 Bucles es que en cada iteraccion cada uno recorra distintas posiciones del array para luego con el if comparar cual valor de cada posicion es mas o menos grande
        if(Array1[i]>Array1[j])//En este caso comparamos si el valor de la posicion en la que recorrio i es mayor a la de j, si no es asi, se deja todo normal
        {
            int aux;
            aux=Array1[i];
            Array1[i]=Array1[j];
            Array1[j]=aux;
        }
    
        for(i=0;i<Array1.length;i++)
        {
            System.out.println(Array1[i]);
        }
        
 }
    
    
}
