package com.ml.lanjut.aplikasiportalberita.response;

import com.google.gson.annotations.SerializedName;

public class BeritaItem{

	@SerializedName("penulis")
	private String penulis;

	@SerializedName("foto")
	private String foto;

	@SerializedName("id")
	private String id;

	@SerializedName("judul_berita")
	private String judulBerita;

	@SerializedName("tanggal_posting")
	private String tanggalPosting;

	@SerializedName("isi_berita")
	private String isiBerita;

	public void setPenulis(String penulis){
		this.penulis = penulis;
	}

	public String getPenulis(){
		return penulis;
	}

	public void setFoto(String foto){
		this.foto = foto;
	}

	public String getFoto(){
		return foto;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setJudulBerita(String judulBerita){
		this.judulBerita = judulBerita;
	}

	public String getJudulBerita(){
		return judulBerita;
	}

	public void setTanggalPosting(String tanggalPosting){
		this.tanggalPosting = tanggalPosting;
	}

	public String getTanggalPosting(){
		return tanggalPosting;
	}

	public void setIsiBerita(String isiBerita){
		this.isiBerita = isiBerita;
	}

	public String getIsiBerita(){
		return isiBerita;
	}

	@Override
 	public String toString(){
		return 
			"BeritaItem{" + 
			"penulis = '" + penulis + '\'' + 
			",foto = '" + foto + '\'' + 
			",id = '" + id + '\'' + 
			",judul_berita = '" + judulBerita + '\'' + 
			",tanggal_posting = '" + tanggalPosting + '\'' + 
			",isi_berita = '" + isiBerita + '\'' + 
			"}";
		}
}