/**
 * Helper class that sets up client currency and language name in database. They can be retrieved back to
 * caller class with getters
 * 
 * @author Petar
 */
package new_offer.helper;


public class SetLanguage {
    
    private String clientCurrency;
    private String languageNameInDB;
    
    public void setLanguage(String clientLanguage){
        switch(clientLanguage){
            case "English General":
                clientCurrency = "EUR General";
                languageNameInDB = "EnglishEUR";
                break;
            case "English UK":
                clientCurrency = "GBP England";
                languageNameInDB = "EnglishGBP";
                break;
            case "Croatian":
                clientCurrency = "HRK Croatia";
                languageNameInDB = "Croatian";
                break;
            case "German":
                clientCurrency = "EUR Germany";
                languageNameInDB = "German";
                break;
            case "Italian":
                clientCurrency = "EUR Italy";
                languageNameInDB = "Italian";
                break;
        }
    }
    
    public String getClientCurrency(){
        return clientCurrency;
    }
    
    public String getLanguageNameInDB(){
        return languageNameInDB;
    }
}
