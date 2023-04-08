package P6;

class ResistorColor {

    private String[] colorArr = {
            "Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Grey", "White"
    };

    int colorCode(String color) {
        for (int i = 0; i < colorArr.length; ++i) {
            if (colorArr[i].equalsIgnoreCase(color)) {
                return i;
            }
        }
        return -1;
    }

    String[] colors() {
        return colorArr;
    }
}
