import geb.Page

class CursosDeDesarrolloHomePage extends Page {

    static at = { title == "Cursos de Desarrollo &#8211; Donde formarte y mejorar tus perspectivas laborales" }

    static content = {
        manualsMenu { module(CursosMenuModule) }
    }
}
