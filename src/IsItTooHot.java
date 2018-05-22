public class IsItTooHot {

    public Boolean isItTooHot (int temperature, boolean isSummer) {

        Boolean tooHot = false;

        if (isSummer){
            if (temperature <= 100 && temperature >= 60){
                tooHot = true;
            } else {
                tooHot = false;
            }
        }

        if (!isSummer){
            if (temperature <= 90 && temperature >= 60){
                tooHot = true;
            } else {
                tooHot = false;
            }
        }

        return tooHot;
    }
}
