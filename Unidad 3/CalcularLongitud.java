public class CalcularLongitud{
    private int lineaPunteada;

    public String calcular(int lineaPunteada){
    this.lineaPunteada=lineaPunteada ;
    int res = lineaPunteada * 2 ;
    return "La longitud es: " + res ;
    }
}