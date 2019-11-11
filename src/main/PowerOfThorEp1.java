package main;

public class PowerOfThorEp1 {
	public String gotoTheLight(int lightX, int lightY, int initialTx, int initialTy){
		String mX = "";
		String mY = "";

		int y = Integer.compare(lightY, initialTy);
		int x = Integer.compare(lightX, initialTx);
		switch(y){
			case 0:
				mY =  "";
				break;
			case -1:
				mY =  "S";
				break;
			case 1:
				mY =  "N";
				break;
		}

		switch(x){
			case 0:
				mX =  "";
				break;
			case -1:
				mX = "W";
				break;
			case 1:
				mX = "E";
				break;
		}

		return mY+mX;
	}

}
