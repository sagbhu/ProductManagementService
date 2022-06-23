package com.productmanagement.response;

import java.util.List;

public class PickerResponse {
	private List<String> surface_reverse_pl;

	private int cod_limit;

	private boolean is_doc;

	private boolean has_cod;

	private String rule_code;

	private List<String> express_reverse_pl;

	private List<String> express_prepaid_pl;

	private boolean has_surface;

	private List<String> express_cod_pl;

	private int avg_tat;

	private String zone;

	private boolean is_air;

	private List<String> surface_prepaid_pl;

	private String to_city;

	private String from_city;

	private boolean is_mps;

	private boolean is_ras;

	private boolean is_active;

	private boolean has_express;

	private boolean has_prepaid;

	private List<String> surface_cod_pl;

	private int to_pincode_id;

	private boolean has_reverse;

	private String from_state;

	private boolean has_dg;

	private String to_state;

	private String err;

	private List<CourierList> courier_list;

	private String edd_stamp;

	private int from_city_id;

	private boolean has_pickup;

	public void setSurface_reverse_pl(List<String> surface_reverse_pl) {
		this.surface_reverse_pl = surface_reverse_pl;
	}

	public List<String> getSurface_reverse_pl() {
		return this.surface_reverse_pl;
	}

	public void setCod_limit(int cod_limit) {
		this.cod_limit = cod_limit;
	}

	public int getCod_limit() {
		return this.cod_limit;
	}

	public void setIs_doc(boolean is_doc) {
		this.is_doc = is_doc;
	}

	public boolean getIs_doc() {
		return this.is_doc;
	}

	public void setHas_cod(boolean has_cod) {
		this.has_cod = has_cod;
	}

	public boolean getHas_cod() {
		return this.has_cod;
	}

	public void setRule_code(String rule_code) {
		this.rule_code = rule_code;
	}

	public String getRule_code() {
		return this.rule_code;
	}

	public void setExpress_reverse_pl(List<String> express_reverse_pl) {
		this.express_reverse_pl = express_reverse_pl;
	}

	public List<String> getExpress_reverse_pl() {
		return this.express_reverse_pl;
	}

	public void setExpress_prepaid_pl(List<String> express_prepaid_pl) {
		this.express_prepaid_pl = express_prepaid_pl;
	}

	public List<String> getExpress_prepaid_pl() {
		return this.express_prepaid_pl;
	}

	public void setHas_surface(boolean has_surface) {
		this.has_surface = has_surface;
	}

	public boolean getHas_surface() {
		return this.has_surface;
	}

	public void setExpress_cod_pl(List<String> express_cod_pl) {
		this.express_cod_pl = express_cod_pl;
	}

	public List<String> getExpress_cod_pl() {
		return this.express_cod_pl;
	}

	public void setAvg_tat(int avg_tat) {
		this.avg_tat = avg_tat;
	}

	public int getAvg_tat() {
		return this.avg_tat;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getZone() {
		return this.zone;
	}

	public void setIs_air(boolean is_air) {
		this.is_air = is_air;
	}

	public boolean getIs_air() {
		return this.is_air;
	}

	public void setSurface_prepaid_pl(List<String> surface_prepaid_pl) {
		this.surface_prepaid_pl = surface_prepaid_pl;
	}

	public List<String> getSurface_prepaid_pl() {
		return this.surface_prepaid_pl;
	}

	public void setTo_city(String to_city) {
		this.to_city = to_city;
	}

	public String getTo_city() {
		return this.to_city;
	}

	public void setFrom_city(String from_city) {
		this.from_city = from_city;
	}

	public String getFrom_city() {
		return this.from_city;
	}

	public void setIs_mps(boolean is_mps) {
		this.is_mps = is_mps;
	}

	public boolean getIs_mps() {
		return this.is_mps;
	}

	public void setIs_ras(boolean is_ras) {
		this.is_ras = is_ras;
	}

	public boolean getIs_ras() {
		return this.is_ras;
	}

	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}

	public boolean getIs_active() {
		return this.is_active;
	}

	public void setHas_express(boolean has_express) {
		this.has_express = has_express;
	}

	public boolean getHas_express() {
		return this.has_express;
	}

	public void setHas_prepaid(boolean has_prepaid) {
		this.has_prepaid = has_prepaid;
	}

	public boolean getHas_prepaid() {
		return this.has_prepaid;
	}

	public void setSurface_cod_pl(List<String> surface_cod_pl) {
		this.surface_cod_pl = surface_cod_pl;
	}

	public List<String> getSurface_cod_pl() {
		return this.surface_cod_pl;
	}

	public void setTo_pincode_id(int to_pincode_id) {
		this.to_pincode_id = to_pincode_id;
	}

	public int getTo_pincode_id() {
		return this.to_pincode_id;
	}

	public void setHas_reverse(boolean has_reverse) {
		this.has_reverse = has_reverse;
	}

	public boolean getHas_reverse() {
		return this.has_reverse;
	}

	public void setFrom_state(String from_state) {
		this.from_state = from_state;
	}

	public String getFrom_state() {
		return this.from_state;
	}

	public void setHas_dg(boolean has_dg) {
		this.has_dg = has_dg;
	}

	public boolean getHas_dg() {
		return this.has_dg;
	}

	public void setTo_state(String to_state) {
		this.to_state = to_state;
	}

	public String getTo_state() {
		return this.to_state;
	}

	public void setErr(String err) {
		this.err = err;
	}

	public String getErr() {
		return this.err;
	}

	public void setCourier_list(List<CourierList> courier_list) {
		this.courier_list = courier_list;
	}

	public List<CourierList> getCourier_list() {
		return this.courier_list;
	}

	public void setEdd_stamp(String edd_stamp) {
		this.edd_stamp = edd_stamp;
	}

	public String getEdd_stamp() {
		return this.edd_stamp;
	}

	public void setFrom_city_id(int from_city_id) {
		this.from_city_id = from_city_id;
	}

	public int getFrom_city_id() {
		return this.from_city_id;
	}

	public void setHas_pickup(boolean has_pickup) {
		this.has_pickup = has_pickup;
	}

	public boolean getHas_pickup() {
		return this.has_pickup;
	}
}