package action;

import org.openqa.selenium.support.PageFactory;

import locators.TeamSportLocators;
import util.HelperClass;

public class TeamSportAction {
		TeamSportLocators loc;
		
		public TeamSportAction() {
			loc = new TeamSportLocators();
			 PageFactory.initElements(HelperClass.getDriver(), loc);
		}
		
		public void clickTeamSport() {
			HelperClass.action.
			
		}

}
