package ListaAsociada;

public class DirectorioTelefonico {

    public static void main(String[] args) {

    }

    public class PhoneEntry{
        String name;
        String phoneNum;
    }

    public class PhoneDirectory{

        PhoneEntry[] info = new PhoneEntry[10]; //espacio para 10 entradas
        int entries = 0; //num actual de entradas

        public void addEntry(String name, String phoneNum){
            info[entries] = new PhoneEntry();
            info[entries].name = name;
            info[entries].phoneNum = phoneNum;
            entries++;
        }

        public String getNumber(String name){
            //devuelve el numero de tele asociado al nombre, nulo si no Existe
            for( int i = 0; i < entries; i++ ){
                if(name.equals(info[i].name)){
                    return info[i].phoneNum;
                }
            }
            return null; //nombre no existe en el directorio
        }
    }
}
