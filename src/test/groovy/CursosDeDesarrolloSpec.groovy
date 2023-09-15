import geb.spock.GebSpec

class CursosDeDesarrolloSpec extends GebSpec {

    def "can get Dockers Post"() {
        given:
        to CursosDeDesarrolloHomePage

        and:
        manualsMenu.open()

        when:
        manualsMenu.cookiesAcceptButton[1].click()
        and:
        manualsMenu.searchInput.value("docker")
        and:
        manualsMenu.searchButton.click()
        then:
        at CursosDeDesarrolloResultadosPage
    }
}