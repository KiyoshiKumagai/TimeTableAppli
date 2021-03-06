
package controller;


import java.util.ArrayList;
import java.util.List;

import Fxml.CreateTimetableMain;
import dao.ClassRoomDAO;
import dao.DepartmentCourseDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

public class DCController  {
	private final String cttPage = "CreateTime.fxml";
	private final String dcregiPage = "CourseRoom.fxml";
	private final String crregiPage = "SubTea.fxml";
	private final String dcdelPage = "DeleteCourseRoom.fxml";
	private final String crdelPage = "DeleteTeaSub.fxml";
	private final String helpPage = "help.fxml";

	@FXML
	private Menu cttmenu, registmenu, deleteMenu, helpMenu;
	@FXML
	private MenuItem cttmenuitem, dcregimenuItem, crregimenuItem,
	dcdeleMenuItem, crdeleMenuItem, nexthelpMenuItem, helpMenuItem;

	@FXML
	private Button RegistButton;

	@FXML
	private TextField dctext1,dctext2, dctext3, dctext4, dctext5, dctext6, dctext7,
					crtext1, crtext2, crtext3, crtext4, crtext5, crtext6, crtext7;

	List<TextField> dclist = new ArrayList<TextField>();
	List<TextField> crlist = new ArrayList<TextField>();

	@FXML
    public void clickregi(ActionEvent e){
		dclist.add(dctext1);
		dclist.add(dctext2);
		dclist.add(dctext3);
		dclist.add(dctext4);
		dclist.add(dctext5);
		dclist.add(dctext6);
		dclist.add(dctext7);

		crlist.add(crtext1);
		crlist.add(crtext2);
		crlist.add(crtext2);
		crlist.add(crtext3);
		crlist.add(crtext4);
		crlist.add(crtext5);
		crlist.add(crtext6);
		crlist.add(crtext7);

		for (TextField t : dclist){
			if(t.getText().equals("")){
				continue;
			}
			DepartmentCourseDAO.insertDAO(t.getText());
			t.setText("");
		}
		for (TextField f : crlist){
			if(f.getText().equals("")){
				continue;
			}
			ClassRoomDAO.insertDAO(f.getText());
			f.setText("");
		}
		System.out.println("登録完了");

    }

	@FXML
	public void nextcttPage(){
		CreateTimetableMain.getInstance().setPage(cttPage);
	}

	@FXML
	public void nextdcregiPage(){
		CreateTimetableMain.getInstance().setPage(dcregiPage);
	}

	@FXML
	public void nextcrregiPage(){
		CreateTimetableMain.getInstance().setPage(crregiPage);
	}

	@FXML
	public void nextdcdelPage(){
		CreateTimetableMain.getInstance().setPage(dcdelPage);
	}

	@FXML
	public void nextcrdelPage(){
		CreateTimetableMain.getInstance().setPage(crdelPage);
	}

	@FXML
	public void nexthelpPage(){
		CreateTimetableMain.getInstance().setPage(helpPage);
	}



}


