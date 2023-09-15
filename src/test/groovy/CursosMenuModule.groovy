import geb.Module

class CursosMenuModule extends Module {
    static content = {
        searchInput { $("#wp-block-search__input-1") }
        cookiesAcceptButton {$(".cdp-cookies-texto a")}
        searchButton { $("button.wp-block-search__button.wp-element-button") }
    }

    void open() {
        // cookiesAceptButton.click()
        // waitFor { !linksContainer.hasClass("animating") }
    }
}
