import geb.Page

class CursosDeDesarrolloHomePage extends Page {

    static url = "https://cursosdedesarrollo.com/"

    static content = {
        manualsMenu { module(CursosMenuModule) }
    }
}
