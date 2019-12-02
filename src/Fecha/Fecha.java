package Fecha;

public class Fecha {
	
	private int dia;
    private int mes;
    private int a�o;

    //Constructor por defecto
    public Fecha() {
    }

    //Constructor con par�metros
    public Fecha(int dia, int mes, int a�o) {
        this.dia = dia;
        this.mes = mes;
        this.a�o = a�o;
    }

    //setters y getters
    public void setDia(int d) {
        dia = d;
    }
    public void setMes(int m) {
        mes = m;
    }
    public void setA�o(int a) {
        a�o = a;
    }
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getA�o() {
        return a�o;
    }

    //M�todo para comprobar si la fecha es correcta
    public boolean fechaCorrecta() {
        boolean diaCorrecto, mesCorrecto, a�oCorrecto;
        a�oCorrecto = a�o > 0;
        mesCorrecto = mes >= 1 && mes <= 12;
        switch (mes) {
            case 2:
                if (esBisiesto()) {
                    diaCorrecto = dia >= 1 && dia <= 29;
                } else {
                    diaCorrecto = dia >= 1 && dia <= 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diaCorrecto = dia >= 1 && dia <= 30;
                break;
            default:
                diaCorrecto = dia >= 1 && dia <= 31;
        }
        return diaCorrecto && mesCorrecto && a�oCorrecto;
    }

    //M�todo privado para comprobar si el a�o es bisiesto
    //Este m�todo lo utiliza el m�todo fechaCorrecta
    private boolean esBisiesto() {
        return (a�o % 4 == 0 && a�o % 100 != 0 || a�o % 400 == 0);
    }

    //M�todo que modifica la fecha cambi�ndola por la del d�a siguiente
    public void diaSiguiente() {
        dia++;
        if (!fechaCorrecta()) {
            dia = 1;
            mes++;
            if (!fechaCorrecta()) {
                mes = 1;
                a�o++;
            }

        }
    }

    //M�todo toString para mostrar la fecha
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (dia < 10) {
            sb.append("0");
        }
        sb.append(dia);
        sb.append("-");
        if (mes < 10) {
            sb.append("0");
        }
        sb.append(mes);
        sb.append("-");
        sb.append(a�o);
        return sb.toString();
    }

} //Fin de la clase Fecha



