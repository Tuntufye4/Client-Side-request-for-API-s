url = new URL(targetURL);
connection = (HttpURLConnection)url.openConnection();
connection.setRequestMethod("POST");
connection.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
connection.setRequestProperty("Content-Length", "" + Integer.toString(urlParameters.getBytes().length));
connection.setRequestProperty("Content-Language", "en-US");
DataOutputStream wr = new DataOutputStream(connection.getOutputStream ());
wr.writeBytes(urlParameters);
wr.flush();
wr.close():