package prog.cipfpbatoi;

import java.util.StringTokenizer;

class Fecha {

	private int dia;

	private int mes;

	private int anyo;

	private static final String[] DIAS_TEXTO = new String[] { "domingo", "lunes", "martes", "miercoles", "jueves", "viernes",
			"sábado"};

	private static final String[] MESES_TEXTO = new String[] { "enero", "febrero", "marzo", "abril", "mayo", "junio",
			"julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre" };

	/**
	 *  Constructor por defecto
	 *  Inicializa una fecha a dia 1-1-1970
	 */
	public Fecha() {
		// tu codigo aqui
		this.dia = 1;
		this.mes = 1;
		this.anyo = 1970;
	}

	/**
	 *  Inicializa la fecha
	 *  @param dia de la semana
	 *  @param mes del año
	 *  @param anyo
	 */
	public Fecha(int dia, int mes, int anyo) {
		// Tu código aquí
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}

	/**
	 * Inicializa la fecha a partir de otra pasada en formato String dd/mm/yyyy
	 *
	 * Deberemos trocearlas de forma que asignemos el día més y año a cada uno de los atributoe
	 * @param fecha
	 */
	public Fecha(String fecha) {
		// Tu código aquí
		StringTokenizer st = new StringTokenizer(fecha, "/");

		int dia = Integer.parseInt(st.nextToken());

		int mes = Integer.parseInt(st.nextToken());

		int anyo = Integer.parseInt(st.nextToken());

		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;



	}

	/**
	 * Modifica la fecha actual a partir de los datos pasados como argumento
	 */
	public void set(int dia, int mes, int anyo) {
		// Tu código aquí
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}

	/**
	 * Obtiene una fecha con los mismos atributos que la fecha actual
	 * @return
	 */
	public Fecha clone() {
		Fecha fecha = new Fecha(this.dia, this.mes, this.anyo);
		return fecha;
	}

	/**
	 * Devuelve el día de la semana que representa por la Fecha actual
	 * @return @dia
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * Devuelve el mes que representa la Fecha actual
	 * @return @mes
	 */
	public int getMes(){
		return mes;
	}

	/**
	 * Devuelve el año que representa la Fecha actual
	 * @return @mes
	 */
	public int getAnyo(){
		return anyo;
	}

	/**
	 * Muestra por pantalla la fecha en formato español dd-mm-yyyy
	 */
	public void mostrarFormatoES()  {
		// Tu código aquí
		System.out.printf("%02d-%02d-%d", this.dia, this.mes, this.anyo);
	}

	/**
	 * Muestra por pantalla la fecha en formato inglés yyyy-mm-dd
	 */
	public void mostrarFormatoGB() {
		// Tu código aquí
		System.out.printf("%d-%02d-%02d", this.anyo,this.mes,this.dia);

	}

	/**
	 * Muestra por pantalla la fecha en formato texto dd-mmmm-yyyy
	 * Ej. 1 enero de 1970
	 */
	public void mostrarFormatoTexto() {
		// Tu código aquí
		switch (this.mes) {
			case 1:
				System.out.printf("%02d-enero-%d",this.dia,this.anyo);
				break;
			case 2:
				System.out.printf("%02d-febrero-%d",this.dia,this.anyo);
				break;
			case 3:
				System.out.printf("%02d-marzo-%d",this.dia,this.anyo);
				break;
			case 4:
				System.out.printf("%02d-abril-%d",this.dia,this.anyo);
				break;
			case 5:
				System.out.printf("%02d-mayo-%d",this.dia,this.anyo);
				break;
			case 6:
				System.out.printf("%02d-junio-%d",this.dia,this.anyo);
				break;
			case 7:
				System.out.printf("%02d-julio-%d",this.dia,this.anyo);
				break;
			case 8:
				System.out.printf("%02d-agosto-%d",this.dia,this.anyo);
				break;
			case 9:
				System.out.printf("%02d-septiembre-%d",this.dia,this.anyo);
				break;
			case 10:
				System.out.printf("%02d-octubre-%d",this.dia,this.anyo);
				break;
			case 11:
				System.out.printf("%02d-noviembre-%d",this.dia,this.anyo);
				break;
			case 12:
				System.out.printf("%02d-diciembre-%d",this.dia,this.anyo);
				break;

		}
	}

	/**
	 * Retorna un booleano indicando si la fecha del objeto es igual a la fecha pasada como
	 * argumento
	 *
	 * @return boolean
	 */
	public boolean isEqual(Fecha otraFecha) {
		Fecha fecha = new Fecha (this.dia, this.mes, this.anyo);
		if (this.dia == otraFecha.dia) {
			if (this.mes == otraFecha.mes) {
				if (this.anyo == otraFecha.anyo) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	/**
	 * Devuelve el número de la semana dentro del año actual.
	 *
	 * @return int dia semana
	 */
	public int getNumeroSemana() {
		return 0;
	}

	/**
	 * Retorna el dia correspondiente de la semana en formato String
	 * @return String
	 */
	public String getDiaSemana() {
		return null;
	}

	/**
	 * Solo Festivo sábado o domingo
	 * @return boolean
	 */
	public boolean isFestivo() {
		return false;
	}

	/**
	 * Devuelve un objeto de tipo fecha que representa una fecha añadiendo @numDias
	 * A la fecha Actual. El número máximo de dias a restar es 30
	 *
	 * @return boolean
	 */
	public Fecha anyadir(int numDias){
		return null;
	}

	/**
	 * Devuelve un objeto de tipo fecha que representa una fecha restando @numDias
	 * A la fecha Actual. El número máximo de dias a restar es 30
	 *
	 * @return boolean
	 */
	public Fecha restar(int numDias){
		return null;
	}

	public boolean isCorrecta(){
		return false;
	}

	/**
	 * Retorna el mes del año en formato text (enero, febrero, marzo,...)
	 * @return char
	 */
	private String getMesTexto() {
		return null;
	}

	/**
	 * Devuelve el número de dias transcurridos desde el 1-1-1
	 *
	 * @return int
	 */
	private int getDiasTranscurridosOrigen() {
		return 0;
	}

	/**
	 * Devuelve el número de dias transcurridos en el anyo que representa el objeto
	 *
	 * @return int
	 */
	private int getDiasTranscurridosAnyo() {
		return 0;
	}

	/**
	 * Indica si el año pasado como argumento es bisiesto. Un año es bisiesto si es divisible por 4
	 * pero no es divisible entre 100 o es divisible entre 4 entre 100 y entre 400
	 *
	 * @return boolean
	 */
	public static boolean isBisiesto(int anyo){
		return false;
	}

	/**
	 *  Calcula el número de días que tiene el @mes en el @año pasado como argumento
	 *  Deberás hacer uso del métodos isBisiesto
	 *
	 *  @return int total dias mes en curso
	 */
	public static int getDiasMes(int mes, int anyo) {
		return 1;
	}

	/**
	 * Calcula el número total de dias que tiene el año pasado como argumento
	 *
	 * @return int total dias anyo en curso
	 */
	public static int getDiasAnyo(int anyo){
		return 0;
	}
}
