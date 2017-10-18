package com.sbk.wats.sender;

import android.os.AsyncTask;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by KimAx on 05/10/2017.
 */

public class Sender extends AsyncTask<URL, Void, JSONObject> {
    private final String USER_AGENT = "Mozilla/5.0";

    private ArrayList<SenderHandler> handlers = new ArrayList<SenderHandler>();

    @Override
    protected JSONObject doInBackground(URL... urls) {
        if (!isCancelled() && urls != null && urls.length > 0) {
            try {
                URL url = urls[0];
                HttpURLConnection httpUrlConn = (HttpURLConnection) url.openConnection();
                httpUrlConn.setRequestMethod("GET");
                httpUrlConn.setRequestProperty("User-Agent", USER_AGENT);

                int responseCode = httpUrlConn.getResponseCode();

                BufferedReader in = new BufferedReader(
                        new InputStreamReader(httpUrlConn.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                return new JSONObject( response.toString() );
            } catch(IOException ex) {
                ex.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    @Override
    protected void onPostExecute(JSONObject jsonObject) {
        super.onPostExecute(jsonObject);
        for(SenderHandler handler : handlers)
            handler.onPostExecute(jsonObject);
    }

    public void addHandler(SenderHandler handler) {
        handlers.add(handler);
    }
}
