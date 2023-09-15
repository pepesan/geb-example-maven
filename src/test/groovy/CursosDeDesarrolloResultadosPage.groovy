import geb.Page

class CursosDeDesarrolloResultadosPage extends Page {

    static url = "https://cursosdedesarrollo.com/?s=docker"
    static at = { title.contains("docker") }
}
