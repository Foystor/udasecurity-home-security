module securitymodule {
    requires com.google.common;
    requires com.google.gson;
    requires java.prefs;
    requires java.desktop;
    requires miglayout;
    requires imagemodule;
    opens com.udacity.security.data to com.google.gson;
}