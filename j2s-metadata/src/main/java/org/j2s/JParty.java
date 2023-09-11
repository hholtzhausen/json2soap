package org.j2s;

import javax.json.bind.annotation.JsonbProperty;

public class JParty
{
  @JsonbProperty("json_first_name")
  private String jsonFirstName;

  @JsonbProperty("json_last_name")
  private String jsonLastName;

  @JsonbProperty("json_id")
  private String jsonId;


  public void setJsonFirstName(String jsonFirstName)
  {
    this.jsonFirstName = jsonFirstName;
  }

  public String getJsonFirstName()
  {
    return this.jsonFirstName;
  }

  public JParty jsonFirstName(String jsonFirstName)
  {
    this.jsonFirstName = jsonFirstName;
    return this;
  }



  public void setJsonLastName(String jsonLastName)
  {
    this.jsonLastName = jsonLastName;
  }

  public String getJsonLastName()
  {
    return this.jsonLastName;
  }

  public JParty jsonLastName(String jsonLastName)
  {
    this.jsonLastName = jsonLastName;
    return this;
  }



  public void setJsonId(String jsonId)
  {
    this.jsonId = jsonId;
  }

  public String getJsonId()
  {
    return this.jsonId;
  }

  public JParty jsonId(String jsonId)
  {
    this.jsonId = jsonId;
    return this;
  }


  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class JParty {\n");
    sb.append("    jsonFirstName: ").append(toIndentedString(jsonFirstName)).append("\n");
    sb.append("    jsonLastName: ").append(toIndentedString(jsonLastName)).append("\n");
    sb.append("    jsonId: ").append(toIndentedString(jsonId)).append("\n");
    sb.append("}");

    return sb.toString();
  }

  private static String toIndentedString(Object o)
  {
    if (o == null)
    {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
