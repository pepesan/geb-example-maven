import geb.spock.GebSpec

class CursosDeDesarrolloSpec extends GebSpec {

    def "can get Dockers Post"() {
        when:
        to CursosDeDesarrolloHomePage

        and:
        manualsMenu.open()

        // then:
        // manualsMenu.links[0].text().startsWith("current")

        and:
        manualsMenu.cookiesAcceptButton[1].click()
        and:
        manualsMenu.searchInput.value("docker")
        and:
        manualsMenu.searchButton.click()
        then:
        at CursosDeDesarrolloResultadosPage
    }
}