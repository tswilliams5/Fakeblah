package models;

import java.util.Date;
import java.util.List;

/**
 * Created by tom on 10/03/15.
 *
 * @author Tom Williams thomas.williams@eysys.com
 */
public class Message {

  private String message;
  private Date dateSent;
  private Date dateReceived;
  private List<User> party;
  private User sender;

  public void createMessage() {

  }
}
