package by.it.gavrilchik.project.java.controller;

import by.it.gavrilchik.project.java.DAO.Dao;
import by.it.gavrilchik.project.java.beans.Ad;
import by.it.gavrilchik.project.java.beans.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;

public class CmdCreateAd extends Cmd{
    @Override
    Action execute(HttpServletRequest req) throws SQLException {
        HttpSession session = req.getSession();
        Object oUser = session.getAttribute("user");
        if (oUser == null)
            return Action.LOGIN;
        User user = (User) oUser;
        if (Util.isPost(req)) {
            String description = Util.getString(req, "description");
            String address = Util.getString(req, "address");
            int flat = Util.getInteger(req, "flat");
            int flats = Util.getInteger(req, "flats");
            int rooms = Util.getInteger(req, "rooms");
            double price = Util.getDouble(req, "price");
            double area = Util.getDouble(req, "area");
            Ad ad = new Ad(0,
                    description,
                    flat, flats,
                    rooms, area,
                    price, address,
                    user.getId());
            Dao.getDao().ad.create(ad);
            return Action.PROFILE;
        }
        return null;
    }

}
