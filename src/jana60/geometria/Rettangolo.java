package jana60.geometria;

/*una classe Rettangolo con due attributi interi: base e altezza. 
 *La classe ha due metodi che calcolano e restituiscono, rispettivamente,
 *l’area e il perimetro del rettangolo.
 */

public class Rettangolo {
	// attributi
	int base;
	int altezza;

	// metodi
	int areaRettangolo() {
		return base * altezza;
	}

	int perimetroRettangolo() {
		return (base + altezza) * 2;
	}
}
