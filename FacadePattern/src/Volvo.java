public class Volvo implements Car{
    @Override
    public void build() {
        System.out.println("This is a Car Factory pattern made by Volvo");
        System.out.println("                      ____________________\n" +
                "                     //|           |        \\\n" +
                "                   //  |           |          \\\n" +
                "      ___________//____|___________|__________()\\__________________\n" +
                "    /__________________|_=_________|_=___________|_________________{}\n" +
                "    [           ______ |           | .           | ==  ______      { }\n" +
                "  __[__        /##  ##\\|           |             |    /##  ##\\    _{# }_\n" +
                " {_____)______|##    ##|___________|_____________|___|##    ##|__(______}\n" +
                "             /  ##__##                              /  ##__##        \\\n" +
                "----------------------------------------------------------------------------");
    }
}
