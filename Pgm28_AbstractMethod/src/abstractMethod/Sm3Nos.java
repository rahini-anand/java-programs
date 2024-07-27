package abstractMethod;

import cal3nos.Cal3Nos;
public class Sm3Nos extends Cal3Nos {
	public void find() {
		result=x<y?(x<z?x:z):(y<z?y:z);
	}
}
