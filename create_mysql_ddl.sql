create table sgij.botes (hjid bigint not null, total_botes_hjid bigint, primary key (hjid)) engine=InnoDB
create table sgij.botes_0 (hjid bigint not null, movimientos_botes_0_hjid bigint, saldofinal_botes_0_hjid bigint, saldoinicial_botes_0_hjid bigint, primary key (hjid)) engine=InnoDB
create table sgij.cruces (hjid bigint not null, layback varchar(255), ticket varchar(255), cruces_desglosecruzadas_hjid bigint, primary key (hjid)) engine=InnoDB
create table sgij.cuentas (hjid bigint not null, cuenta varchar(255), saldofinal_cuentas_hjid bigint, cuentas_jugador_hjid bigint, primary key (hjid)) engine=InnoDB
create table sgij.desglose (hjid bigint not null, botedesc varchar(255), boteid varchar(255), movimiento_desglose_hjid bigint, desglose_botes_hjid bigint, primary key (hjid)) engine=InnoDB
create table sgij.desglose_0 (hjid bigint not null, operadorid varchar(255), tipojuego varchar(255), importe_desglose_0_hjid bigint, desglose_desgloseoperadortip_0 bigint, primary key (hjid)) engine=InnoDB
create table sgij.desglose_1 (hjid bigint not null, operadorid varchar(255), importe_desglose_1_hjid bigint, desglose_desgloseoperador_hj_0 bigint, primary key (hjid)) engine=InnoDB
create table sgij.desglose_2 (hjid bigint not null, concepto varchar(255), operadorid varchar(255), importe_desglose_2_hjid bigint, desglose_desgloseoperadorcon_0 bigint, primary key (hjid)) engine=InnoDB
create table sgij.desglose_3 (hjid bigint not null, importe decimal(20,2), mediopago varchar(255), otrotipoespecificar varchar(255), tipomediopago varchar(255), desglose_desglosemediopago_h_0 bigint, primary key (hjid)) engine=InnoDB
create table sgij.desglosebotes (hjid bigint not null, botedesc varchar(255), boteid varchar(255), fechafin varchar(255), fechainicio varchar(255), movimientos_desglosebotes_hj_0 bigint, saldofinal_desglosebotes_hjid bigint, saldoinicial_desglosebotes_h_0 bigint, desglosebotes_botes_0_hjid bigint, primary key (hjid)) engine=InnoDB
create table sgij.desglosecompromiso (hjid bigint not null, fecha varchar(255), saldofinal_desglosecompromis_0 bigint, desglosecompromiso_partidasv_0 bigint, primary key (hjid)) engine=InnoDB
create table sgij.desglosecruzadas (hjid bigint not null, reto varchar(255), desglosecruzadas_jugador_1_h_0 bigint, primary key (hjid)) engine=InnoDB
create table sgij.desgloseespecie (hjid bigint not null, descripcion varchar(255), valoracion_desgloseespecie_h_0 bigint, desgloseespecie_jugador_1_hj_0 bigint, primary key (hjid)) engine=InnoDB
create table sgij.desglosemediopago (hjid bigint not null, total decimal(20,2), primary key (hjid)) engine=InnoDB
create table sgij.desgloseoperaciones (hjid bigint not null, total decimal(20,2), primary key (hjid)) engine=InnoDB
create table sgij.desgloseoperador (hjid bigint not null, total_desgloseoperador_hjid bigint, primary key (hjid)) engine=InnoDB
create table sgij.desgloseoperadorconcepto (hjid bigint not null, total_desgloseoperadorconcep_0 bigint, primary key (hjid)) engine=InnoDB
create table sgij.desgloseoperadortipojuego (hjid bigint not null, total_desgloseoperadortipoju_0 bigint, primary key (hjid)) engine=InnoDB
create table sgij.domicilio (hjid bigint not null, cp varchar(255), ciudad varchar(255), direccion varchar(255), pais varchar(255), primary key (hjid)) engine=InnoDB
create table sgij.domicilio_0 (hjid bigint not null, cp varchar(255), ciudad varchar(255), direccion varchar(255), pais varchar(255), primary key (hjid)) engine=InnoDB
create table sgij.estado (hjid bigint not null, estadocnj varchar(255), estadooperador varchar(255), primary key (hjid)) engine=InnoDB
create table sgij.estado_0 (hjid bigint not null, estadocnj varchar(255), estadooperador varchar(255), primary key (hjid)) engine=InnoDB
create table sgij.eventos (hjid bigint not null, eventoid varchar(255), fechahecho varchar(255), hecho varchar(255), eventos_registroapuesta_hjid bigint, primary key (hjid)) engine=InnoDB
create table sgij.historico (hjid bigint not null, desde varchar(255), estadocnj varchar(255), estadooperador varchar(255), historico_estado_hjid bigint, primary key (hjid)) engine=InnoDB
create table sgij.id (hjid bigint not null, jugadorid varchar(255), operadorid varchar(255), id_jugador_0_hjid bigint, id_jugador_3_hjid bigint, id_jugador_2_hjid bigint, id_jugador_hjid bigint, primary key (hjid)) engine=InnoDB
create table sgij.importe (hjid bigint not null, primary key (hjid)) engine=InnoDB
create table sgij.jugador (hjid bigint not null, ajustepremios_jugador_hjid bigint, bonos_jugador_hjid bigint, comision_jugador_hjid bigint, depositos_jugador_hjid bigint, otros_jugador_hjid bigint, participacion_jugador_hjid bigint, participaciondevolucion_juga_0 bigint, premios_jugador_hjid bigint, premiosespecie_jugador_hjid bigint, retiradas_jugador_hjid bigint, saldofinal_jugador_hjid bigint, saldoinicial_jugador_hjid bigint, transin_jugador_hjid bigint, transout_jugador_hjid bigint, jugador_registrocjd_hjid bigint, primary key (hjid)) engine=InnoDB
create table sgij.jugador_0 (hjid bigint not null, fvdocumental varchar(255), fvsvdi varchar(255), vdocumental varchar(255), vsvdi varchar(255), apellido1 varchar(255), apellido2 varchar(255), cambiosendatos varchar(255), email varchar(255), fechaactivacion varchar(255), fechanacimiento varchar(255), login varchar(255), nombre varchar(255), regionfiscal varchar(255), sexo varchar(255), telefono varchar(255), domicilio_jugador_0_hjid bigint, estado_jugador_0_hjid bigint, limitesdeposito_jugador_0_hj_0 bigint, noresidente_jugador_0_hjid bigint, residente_jugador_0_hjid bigint, jugador_registrorud_hjid bigint, primary key (hjid)) engine=InnoDB
create table sgij.jugador_1 (hjid bigint not null, ip varchar(255), cuota decimal(20,10), dispositivo varchar(255), fechaapuesta varchar(255), iddispositivo varchar(255), ticketapuesta varchar(255), id_jugador_1_hjid bigint, participacion_jugador_1_hjid bigint, participaciondevolucion_juga_1 bigint, planificacionazar_jugador_1__0 bigint, premios_jugador_1_hjid bigint, premiosespecie_jugador_1_hjid bigint, jugador_registrojud_hjid bigint, primary key (hjid)) engine=InnoDB
create table sgij.jugador_2 (hjid bigint not null, fechaactivacion varchar(255), login varchar(255), estado_jugador_2_hjid bigint, jugador_registrorur_hjid bigint, primary key (hjid)) engine=InnoDB
create table sgij.jugador_3 (hjid bigint not null, fvdocumental varchar(255), fvsvdi varchar(255), vdocumental varchar(255), vsvdi varchar(255), apellido1 varchar(255), apellido2 varchar(255), email varchar(255), fechanacimiento varchar(255), nombre varchar(255), premio decimal(20,10), regionfiscal varchar(255), retencion decimal(20,10), sexo varchar(255), telefono varchar(255), domicilio_jugador_3_hjid bigint, noresidente_jugador_3_hjid bigint, residente_jugador_3_hjid bigint, jugador_registrorug_hjid bigint, primary key (hjid)) engine=InnoDB
create table sgij.limitesdeposito (hjid bigint not null, diario decimal(20,2), mensual decimal(20,2), semanal decimal(20,2), primary key (hjid)) engine=InnoDB
create table sgij.linea (hjid bigint not null, cantidad decimal(20,10), unidad varchar(255), linea_importe_hjid bigint, primary key (hjid)) engine=InnoDB
create table sgij.lote (hjid bigint not null, anyobject longtext, cabecera_lote_hjid bigint, primary key (hjid)) engine=InnoDB
create table sgij.lotecabecera (hjid bigint not null, almacenid varchar(255), loteid varchar(255), operadorid varchar(255), version_ varchar(255), primary key (hjid)) engine=InnoDB
create table sgij.noresidente (hjid bigint not null, documento varchar(255), especificartipodocumento varchar(255), nacionalidad varchar(255), paisresidencia varchar(255), tipodocumento varchar(255), primary key (hjid)) engine=InnoDB
create table sgij.noresidente_0 (hjid bigint not null, documento varchar(255), especificartipodocumento varchar(255), nacionalidad varchar(255), paisresidencia varchar(255), tipodocumento varchar(255), primary key (hjid)) engine=InnoDB
create table sgij.numerojugadoresporestado (hjid bigint not null, estadocnj varchar(255), estadooperador varchar(255), numero decimal(20,0), numerojugadoresporestado_reg_0 bigint, primary key (hjid)) engine=InnoDB
create table sgij.operaciones (hjid bigint not null, ip varchar(255), dispositivo varchar(255), fecha varchar(255), iddispositivo varchar(255), importe decimal(20,2), mediopago varchar(255), otrotipoespecificar varchar(255), tipomediopago varchar(255), operaciones_desgloseoperacio_0 bigint, primary key (hjid)) engine=InnoDB
create table sgij.partidasvivas (hjid bigint not null, movimientos_partidasvivas_hj_0 bigint, saldofinal_partidasvivas_hjid bigint, saldoinicial_partidasvivas_h_0 bigint, primary key (hjid)) engine=InnoDB
create table sgij.periodo (hjid bigint not null, primary key (hjid)) engine=InnoDB
create table sgij.periodo_0 (dia varchar(255), mes varchar(255), hjid bigint not null, primary key (hjid)) engine=InnoDB
create table sgij.planificacionazar (hjid bigint not null, duracionlimite varchar(255), participacionlimite decimal(20,2), primary key (hjid)) engine=InnoDB
create table sgij.rectificacion (hjid bigint not null, registrofecha varchar(255), registroid varchar(255), primary key (hjid)) engine=InnoDB
create table sgij.registroanulador (hjid bigint not null, primary key (hjid)) engine=InnoDB
create table sgij.registroapuesta (endirecto varchar(255), numeroapostantes decimal(20,0), numeroeventos decimal(20,0), tipoapuesta varchar(255), hjid bigint not null, primary key (hjid)) engine=InnoDB
create table sgij.registrobase (hjid bigint not null, cabecera_registrobase_hjid bigint, registro_lote_hjid bigint, primary key (hjid)) engine=InnoDB
create table sgij.registrobingo (preciocarton decimal(20,2), hjid bigint not null, primary key (hjid)) engine=InnoDB
create table sgij.registrobot (tipojuego varchar(255), hjid bigint not null, botes_registrobot_hjid bigint, partidasvivas_registrobot_hj_0 bigint, primary key (hjid)) engine=InnoDB
create table sgij.registrocabecera (hjid bigint not null, almacenid varchar(255), fecha varchar(255), operadorid varchar(255), registroid varchar(255), subregistroid decimal(20,0), subregistrototal decimal(20,0), rectificacion_registrocabece_0 bigint, primary key (hjid)) engine=InnoDB
create table sgij.registrocevdm (hjid bigint not null, primary key (hjid)) engine=InnoDB
create table sgij.registrocevdmeventoidanddesc_0 (hjid bigint not null, itemactualizado varchar(255), itemcompeticion varchar(255), itemdeporte varchar(255), itemdescripcionevento varchar(255), itemeventoid varchar(255), itemfechafin varchar(255), itemfechainicio varchar(255), itemotrodeporteespecificar varchar(255), itemtipoevento varchar(255), eventoidanddescripcionevento_1 bigint, primary key (hjid)) engine=InnoDB
create table sgij.registrocjd (hjid bigint not null, primary key (hjid)) engine=InnoDB
create table sgij.registrocjt (hjid bigint not null, ajustepremios_registrocjt_hj_0 bigint, bonos_registrocjt_hjid bigint, comision_registrocjt_hjid bigint, depositos_registrocjt_hjid bigint, otros_registrocjt_hjid bigint, participacion_registrocjt_hj_0 bigint, participaciondevolucion_regi_2 bigint, premios_registrocjt_hjid bigint, premiosespecie_registrocjt_h_0 bigint, retiradas_registrocjt_hjid bigint, saldofinal_registrocjt_hjid bigint, saldoinicial_registrocjt_hjid bigint, transin_registrocjt_hjid bigint, transout_registrocjt_hjid bigint, primary key (hjid)) engine=InnoDB
create table sgij.registroconcurso (stallamadas decimal(20,2), stasms decimal(20,2), importemaximollamada decimal(20,2), numerollamadas decimal(20,0), numeroparticipaciones decimal(20,0), numeropremiados decimal(20,0), numerosms decimal(20,0), participacionllamadas decimal(20,2), participacionsms decimal(20,2), preciominutollamada decimal(20,2), preciosms decimal(20,2), hjid bigint not null, primary key (hjid)) engine=InnoDB
create table sgij.registrojua (hjid bigint not null, primary key (hjid)) engine=InnoDB
create table sgij.registrojuaeventoidandticket_0 (hjid bigint not null, itemeventoid varchar(255), itemfechaajuste varchar(255), itemmotivoajuste varchar(255), itemticketapuesta varchar(255), itemid_registrojuaeventoidan_0 bigint, itemimporteajuste_registroju_0 bigint, eventoidandticketapuestaandi_1 bigint, primary key (hjid)) engine=InnoDB
create table sgij.registrojud (fechafin varchar(255), juegoid varchar(255), hjid bigint not null, primary key (hjid)) engine=InnoDB
create table sgij.registrojut (booleanli varchar(255), fechafin varchar(255), fechainicio varchar(255), juegoaplazado varchar(255), juegocancelado varchar(255), juegodesc varchar(255), juegoenred varchar(255), juegoid varchar(255), juegosuspendido varchar(255), tipojuego varchar(255), hjid bigint not null, totales_registrojut_hjid bigint, primary key (hjid)) engine=InnoDB
create table sgij.registroloteria (numeroapostantes decimal(20,0), hjid bigint not null, primary key (hjid)) engine=InnoDB
create table sgij.registromensualbase (mes varchar(255), hjid bigint not null, primary key (hjid)) engine=InnoDB
create table sgij.registroopt (tipojuego varchar(255), hjid bigint not null, ggr_registroopt_hjid bigint, ajustesred_registroopt_hjid bigint, botes_registroopt_hjid bigint, comision_registroopt_hjid bigint, otros_registroopt_hjid bigint, participacion_registroopt_hj_0 bigint, participaciondevolucion_regi_0 bigint, premios_registroopt_hjid bigint, premiosespecie_registroopt_h_0 bigint, primary key (hjid)) engine=InnoDB
create table sgij.registroort (tipojuego varchar(255), hjid bigint not null, ggr_registroort_hjid bigint, ajustesred_registroort_hjid bigint, botes_registroort_hjid bigint, comision_registroort_hjid bigint, otros_registroort_hjid bigint, participacion_registroort_hj_0 bigint, participaciondevolucion_regi_1 bigint, premios_registroort_hjid bigint, premiosespecie_registroort_h_0 bigint, primary key (hjid)) engine=InnoDB
create table sgij.registroperiodicobase (periodicidad varchar(255), hjid bigint not null, periodo_registroperiodicobas_0 bigint, primary key (hjid)) engine=InnoDB
create table sgij.registropokercash (mesaid varchar(255), variante varchar(255), variantecomercial varchar(255), hjid bigint not null, primary key (hjid)) engine=InnoDB
create table sgij.registropokertorneo (numeroparticipantes decimal(20,0), variante varchar(255), variantecomercial varchar(255), hjid bigint not null, primary key (hjid)) engine=InnoDB
create table sgij.registropuntobanca (hjid bigint not null, primary key (hjid)) engine=InnoDB
create table sgij.registrorud (hjid bigint not null, primary key (hjid)) engine=InnoDB
create table sgij.registrorug (hjid bigint not null, primary key (hjid)) engine=InnoDB
create table sgij.registrorur (hjid bigint not null, primary key (hjid)) engine=InnoDB
create table sgij.registrorut (numeroactividad decimal(20,0), numeroaltas decimal(20,0), numerobajas decimal(20,0), numerojugadores decimal(20,0), hjid bigint not null, primary key (hjid)) engine=InnoDB
create table sgij.registrosesion (partidasjugadas decimal(20,0), variante varchar(255), variantecomercial varchar(255), hjid bigint not null, primary key (hjid)) engine=InnoDB
create table sgij.residente (hjid bigint not null, dni varchar(255), nie varchar(255), nacionalidad varchar(255), primary key (hjid)) engine=InnoDB
create table sgij.residente_0 (hjid bigint not null, dni varchar(255), nie varchar(255), nacionalidad varchar(255), primary key (hjid)) engine=InnoDB
create table sgij.totales (hjid bigint not null, botes_totales_hjid bigint, participacion_totales_hjid bigint, participaciondevolucion_tota_0 bigint, premios_totales_hjid bigint, premiosespecie_totales_hjid bigint, primary key (hjid)) engine=InnoDB
create table hibernate_sequence (next_val bigint) engine=InnoDB
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
create table jugador_0_pseudonimo (hjid bigint not null, hjvalue varchar(255), hjindex integer not null, primary key (hjid, hjindex)) engine=InnoDB
create table product_dimension (product_key bigint not null, product_version bigint not null, discontinued_flag TINYINT(1), product_description varchar(255), product_price float, primary key (product_key, product_version)) engine=InnoDB
alter table sgij.botes add constraint FK2b0lu47ow54l2blnrblklx5sw foreign key (total_botes_hjid) references sgij.importe (hjid)
alter table sgij.botes_0 add constraint FKfntj9m3ydu17e3kiukhb71a6 foreign key (movimientos_botes_0_hjid) references sgij.importe (hjid)
alter table sgij.botes_0 add constraint FK8w25pbfct4nac0yfhwanegt0 foreign key (saldofinal_botes_0_hjid) references sgij.importe (hjid)
alter table sgij.botes_0 add constraint FKno9ow1gl7k6676sh8xx5l16nu foreign key (saldoinicial_botes_0_hjid) references sgij.importe (hjid)
alter table sgij.cruces add constraint FK4hjca3561ihue2ikccu7mlan foreign key (cruces_desglosecruzadas_hjid) references sgij.desglosecruzadas (hjid)
alter table sgij.cuentas add constraint FKc5fu9hu30t9uwutjrtru15eay foreign key (saldofinal_cuentas_hjid) references sgij.importe (hjid)
alter table sgij.cuentas add constraint FK57n5avv2d28akr6amlqic6sw8 foreign key (cuentas_jugador_hjid) references sgij.jugador (hjid)
alter table sgij.desglose add constraint FKa2iewfkq1xbm5wyrxtt7ruu5t foreign key (movimiento_desglose_hjid) references sgij.importe (hjid)
alter table sgij.desglose add constraint FKqrcevhucjomwjnvu7dsw928e5 foreign key (desglose_botes_hjid) references sgij.botes (hjid)
alter table sgij.desglose_0 add constraint FKb1avc4q0pt1xyl2xsc3pnjxtt foreign key (importe_desglose_0_hjid) references sgij.importe (hjid)
alter table sgij.desglose_0 add constraint FKsuwb5ayw8vqxfjmmnuhg76294 foreign key (desglose_desgloseoperadortip_0) references sgij.desgloseoperadortipojuego (hjid)
alter table sgij.desglose_1 add constraint FK3nu2bwncdxu4kk9l4poak1jn0 foreign key (importe_desglose_1_hjid) references sgij.importe (hjid)
alter table sgij.desglose_1 add constraint FKbsqhttkncwueekgd99t82edgy foreign key (desglose_desgloseoperador_hj_0) references sgij.desgloseoperador (hjid)
alter table sgij.desglose_2 add constraint FKjn19g20ln7dmv7q85kjbp9eq0 foreign key (importe_desglose_2_hjid) references sgij.importe (hjid)
alter table sgij.desglose_2 add constraint FK9779n5au0mvin1vrkyaup0o7f foreign key (desglose_desgloseoperadorcon_0) references sgij.desgloseoperadorconcepto (hjid)
alter table sgij.desglose_3 add constraint FKeyfu2jrja9mwv23g78rsi8sv7 foreign key (desglose_desglosemediopago_h_0) references sgij.desglosemediopago (hjid)
alter table sgij.desglosebotes add constraint FKmopc110bpw0s5ha5gpq3xg52x foreign key (movimientos_desglosebotes_hj_0) references sgij.importe (hjid)
alter table sgij.desglosebotes add constraint FKr852aa9wp8ag8ldrwaw063kn3 foreign key (saldofinal_desglosebotes_hjid) references sgij.importe (hjid)
alter table sgij.desglosebotes add constraint FKloh4ehv5pj0w06nuxfsx7y3qi foreign key (saldoinicial_desglosebotes_h_0) references sgij.importe (hjid)
alter table sgij.desglosebotes add constraint FKrywtwu1lob6bshe5pi0ms362l foreign key (desglosebotes_botes_0_hjid) references sgij.botes_0 (hjid)
alter table sgij.desglosecompromiso add constraint FK2vjoutel2ls3rolv3lgkd2804 foreign key (saldofinal_desglosecompromis_0) references sgij.importe (hjid)
alter table sgij.desglosecompromiso add constraint FKhf67m9t87q4r5f4s6yttaasrg foreign key (desglosecompromiso_partidasv_0) references sgij.partidasvivas (hjid)
alter table sgij.desglosecruzadas add constraint FK8wj1aonk6n1og4iwojvaiaws6 foreign key (desglosecruzadas_jugador_1_h_0) references sgij.jugador_1 (hjid)
alter table sgij.desgloseespecie add constraint FKdri5kx5aegk8pdfoe24592msy foreign key (valoracion_desgloseespecie_h_0) references sgij.importe (hjid)
alter table sgij.desgloseespecie add constraint FK1o6eo4bdw1cbkv4gj0yqkkvua foreign key (desgloseespecie_jugador_1_hj_0) references sgij.jugador_1 (hjid)
alter table sgij.desgloseoperador add constraint FK1l5oe2jr7xdwodvcxa76wfeip foreign key (total_desgloseoperador_hjid) references sgij.importe (hjid)
alter table sgij.desgloseoperadorconcepto add constraint FKoloicqodf67fjga04uef49mfj foreign key (total_desgloseoperadorconcep_0) references sgij.importe (hjid)
alter table sgij.desgloseoperadortipojuego add constraint FKtl0q5ptgm8pgin76wem3laer3 foreign key (total_desgloseoperadortipoju_0) references sgij.importe (hjid)
alter table sgij.eventos add constraint FKk451pw9d1iyuro4ybljdn3s2v foreign key (eventos_registroapuesta_hjid) references sgij.registroapuesta (hjid)
alter table sgij.historico add constraint FKhwsc8bu9oet9fsutd4vye3eb0 foreign key (historico_estado_hjid) references sgij.estado (hjid)
alter table sgij.id add constraint FKxxydj995t3nfm0hre4jjkuq7 foreign key (id_jugador_0_hjid) references sgij.jugador_0 (hjid)
alter table sgij.id add constraint FKhj4lvbukwwpa5ykjc6lgbmtkn foreign key (id_jugador_3_hjid) references sgij.jugador_3 (hjid)
alter table sgij.id add constraint FKgvyc4ijf99538nuwng44cxlg8 foreign key (id_jugador_2_hjid) references sgij.jugador_2 (hjid)
alter table sgij.id add constraint FKt1mg4ya79lkpnoxh4dykjke9w foreign key (id_jugador_hjid) references sgij.jugador (hjid)
alter table sgij.jugador add constraint FKthsqnt0aw67r132smjyywl2bm foreign key (ajustepremios_jugador_hjid) references sgij.desgloseoperadortipojuego (hjid)
alter table sgij.jugador add constraint FKgsvt2ayp1mx72nps9ryy9273m foreign key (bonos_jugador_hjid) references sgij.desgloseoperadorconcepto (hjid)
alter table sgij.jugador add constraint FKiwmc5g3nct3crvu3y7upgw0l5 foreign key (comision_jugador_hjid) references sgij.desgloseoperadortipojuego (hjid)
alter table sgij.jugador add constraint FKj1yw8rslsf1kw3421si0nowgq foreign key (depositos_jugador_hjid) references sgij.desgloseoperaciones (hjid)
alter table sgij.jugador add constraint FKp39og10642a82nhwdjmbbskm8 foreign key (otros_jugador_hjid) references sgij.desgloseoperadorconcepto (hjid)
alter table sgij.jugador add constraint FK4wrkwsnvm9bci0dbvxop86nde foreign key (participacion_jugador_hjid) references sgij.desgloseoperadortipojuego (hjid)
alter table sgij.jugador add constraint FKm6652tvpgr0jv9wuia3asxih2 foreign key (participaciondevolucion_juga_0) references sgij.desgloseoperadortipojuego (hjid)
alter table sgij.jugador add constraint FKsu5p9bw464pquc0q1gxj1w534 foreign key (premios_jugador_hjid) references sgij.desgloseoperadortipojuego (hjid)
alter table sgij.jugador add constraint FKh1bo77966ir9vtgj587k7isv5 foreign key (premiosespecie_jugador_hjid) references sgij.desgloseoperadortipojuego (hjid)
alter table sgij.jugador add constraint FKihbycf6m69tvq16s0996bux42 foreign key (retiradas_jugador_hjid) references sgij.desgloseoperaciones (hjid)
alter table sgij.jugador add constraint FKft8s3db1p9824ws39ke2stjyc foreign key (saldofinal_jugador_hjid) references sgij.importe (hjid)
alter table sgij.jugador add constraint FK8jsq2y3uni8jckn561ohxr8kw foreign key (saldoinicial_jugador_hjid) references sgij.importe (hjid)
alter table sgij.jugador add constraint FK9enh05mcxki5wrwragjxi8y3b foreign key (transin_jugador_hjid) references sgij.desgloseoperador (hjid)
alter table sgij.jugador add constraint FKh6cyxf0vsbhhv2w5j858o68p6 foreign key (transout_jugador_hjid) references sgij.desgloseoperador (hjid)
alter table sgij.jugador add constraint FK3bxbfavcidh06keae21gebp9 foreign key (jugador_registrocjd_hjid) references sgij.registrocjd (hjid)
alter table sgij.jugador_0 add constraint FKjlw6vpq91ld5qp9okcfhjgmm3 foreign key (domicilio_jugador_0_hjid) references sgij.domicilio (hjid)
alter table sgij.jugador_0 add constraint FKsp6biq5cv5o3fa47fdeh73y54 foreign key (estado_jugador_0_hjid) references sgij.estado (hjid)
alter table sgij.jugador_0 add constraint FKbvr04bsbfw54c98fh0wwitxer foreign key (limitesdeposito_jugador_0_hj_0) references sgij.limitesdeposito (hjid)
alter table sgij.jugador_0 add constraint FKlb0c9yl4qjj3sc3oiktud25pp foreign key (noresidente_jugador_0_hjid) references sgij.noresidente (hjid)
alter table sgij.jugador_0 add constraint FKlyjfxhf7jw7k5jx51v60yluew foreign key (residente_jugador_0_hjid) references sgij.residente (hjid)
alter table sgij.jugador_0 add constraint FK50igtore58d4y2n8n0xdtno2b foreign key (jugador_registrorud_hjid) references sgij.registrorud (hjid)
alter table sgij.jugador_1 add constraint FK6dfr5c99k4skpsrmewoie0vjd foreign key (id_jugador_1_hjid) references sgij.id (hjid)
alter table sgij.jugador_1 add constraint FKhiqco9s01w855onhv2kd9dmyo foreign key (participacion_jugador_1_hjid) references sgij.importe (hjid)
alter table sgij.jugador_1 add constraint FK3jc1d86gsk7gdtdqtklujh6dr foreign key (participaciondevolucion_juga_1) references sgij.importe (hjid)
alter table sgij.jugador_1 add constraint FKq5ae1762fff6j96yk8ioe1yt2 foreign key (planificacionazar_jugador_1__0) references sgij.planificacionazar (hjid)
alter table sgij.jugador_1 add constraint FKmsjbd31cjcd96j88fvr4rhjh foreign key (premios_jugador_1_hjid) references sgij.importe (hjid)
alter table sgij.jugador_1 add constraint FK3uaix2wkdll1tw9wfmwpc84hp foreign key (premiosespecie_jugador_1_hjid) references sgij.importe (hjid)
alter table sgij.jugador_1 add constraint FKmnc89xmh8a3elfqwnlciwya8 foreign key (jugador_registrojud_hjid) references sgij.registrojud (hjid)
alter table sgij.jugador_2 add constraint FKt2qnf5anj1lnpjc7xffgd2ab5 foreign key (estado_jugador_2_hjid) references sgij.estado_0 (hjid)
alter table sgij.jugador_2 add constraint FKt1fu7xuasa2948ss248xdwrvg foreign key (jugador_registrorur_hjid) references sgij.registrorur (hjid)
alter table sgij.jugador_3 add constraint FK9uoj5abn8q2d2ukcamj7xar7i foreign key (domicilio_jugador_3_hjid) references sgij.domicilio_0 (hjid)
alter table sgij.jugador_3 add constraint FKrffoi0x6t6vjdjau5gv6yjq2m foreign key (noresidente_jugador_3_hjid) references sgij.noresidente_0 (hjid)
alter table sgij.jugador_3 add constraint FKrstwv897w9qsn8ifr4d1c0k3h foreign key (residente_jugador_3_hjid) references sgij.residente_0 (hjid)
alter table sgij.jugador_3 add constraint FK5t4balik8gsh3b4tpmrb8jrbh foreign key (jugador_registrorug_hjid) references sgij.registrorug (hjid)
alter table sgij.linea add constraint FK7r44tdc4bvxfytwee7p8mh6lo foreign key (linea_importe_hjid) references sgij.importe (hjid)
alter table sgij.lote add constraint FKkofd9beqke8bj1cpx967ngg4c foreign key (cabecera_lote_hjid) references sgij.lotecabecera (hjid)
alter table sgij.numerojugadoresporestado add constraint FKfffh9dy6kpt9ojk6b44bm98jp foreign key (numerojugadoresporestado_reg_0) references sgij.registrorut (hjid)
alter table sgij.operaciones add constraint FKdtxyp6bk85uv5ys6kv40i6f62 foreign key (operaciones_desgloseoperacio_0) references sgij.desgloseoperaciones (hjid)
alter table sgij.partidasvivas add constraint FKo19wtvwkns3jmuwpggbij09lg foreign key (movimientos_partidasvivas_hj_0) references sgij.importe (hjid)
alter table sgij.partidasvivas add constraint FKd4rr6ixtgojxpehm499ti6q5n foreign key (saldofinal_partidasvivas_hjid) references sgij.importe (hjid)
alter table sgij.partidasvivas add constraint FKbnomr7t6vc6e2few81dna53b9 foreign key (saldoinicial_partidasvivas_h_0) references sgij.importe (hjid)
alter table sgij.periodo_0 add constraint FKqrf65a4gndoh7x0vvu02swkpg foreign key (hjid) references sgij.periodo (hjid)
alter table sgij.registroanulador add constraint FKelmugxmvyqw5r3gtuxbhohmcb foreign key (hjid) references sgij.registrobase (hjid)
alter table sgij.registroapuesta add constraint FKs7dxc974tiukgdc0p5aamounn foreign key (hjid) references sgij.registrojut (hjid)
alter table sgij.registrobase add constraint FKanflqm1cg0buse3m1s7m0j1k5 foreign key (cabecera_registrobase_hjid) references sgij.registrocabecera (hjid)
alter table sgij.registrobase add constraint FKfqpn0b3puw05qidk1sp83de77 foreign key (registro_lote_hjid) references sgij.lote (hjid)
alter table sgij.registrobingo add constraint FK9n5vxa31p2w6nd113cwwhjd1b foreign key (hjid) references sgij.registrojut (hjid)
alter table sgij.registrobot add constraint FKn40q7cw1qd2mkmlv6qysbmou4 foreign key (botes_registrobot_hjid) references sgij.botes_0 (hjid)
alter table sgij.registrobot add constraint FKm6cr5brissvolupu3rigu3bsh foreign key (partidasvivas_registrobot_hj_0) references sgij.partidasvivas (hjid)
alter table sgij.registrobot add constraint FKefrm1ches8cycuj0gg0x466ac foreign key (hjid) references sgij.registromensualbase (hjid)
alter table sgij.registrocabecera add constraint FKgdqjf9rmw1pvc50pt9fwfy49n foreign key (rectificacion_registrocabece_0) references sgij.rectificacion (hjid)
alter table sgij.registrocevdm add constraint FKg5fy9tbm1l8pc2v35yak2ucn0 foreign key (hjid) references sgij.registroperiodicobase (hjid)
alter table sgij.registrocevdmeventoidanddesc_0 add constraint FK56we2ggeun6ed7lv3bnt1o7cb foreign key (eventoidanddescripcionevento_1) references sgij.registrocevdm (hjid)
alter table sgij.registrocjd add constraint FKqmg161eqpqj8wm5h4stwagbm5 foreign key (hjid) references sgij.registroperiodicobase (hjid)
alter table sgij.registrocjt add constraint FK8syn64sfmvihnfkm4pvhbsshj foreign key (ajustepremios_registrocjt_hj_0) references sgij.desgloseoperadortipojuego (hjid)
alter table sgij.registrocjt add constraint FKq0yixq7npgqnb5cy7xyhfo4ed foreign key (bonos_registrocjt_hjid) references sgij.desgloseoperadorconcepto (hjid)
alter table sgij.registrocjt add constraint FKpssfbba5a5m6t4wlochlwio7g foreign key (comision_registrocjt_hjid) references sgij.desgloseoperadortipojuego (hjid)
alter table sgij.registrocjt add constraint FKqcpwyaq6pra7dkl7lg6rxkiwi foreign key (depositos_registrocjt_hjid) references sgij.desglosemediopago (hjid)
alter table sgij.registrocjt add constraint FKqforq0amxk4il0pqda7gr2brv foreign key (otros_registrocjt_hjid) references sgij.desgloseoperadorconcepto (hjid)
alter table sgij.registrocjt add constraint FK5uggil9lt0t8n00gylikceki8 foreign key (participacion_registrocjt_hj_0) references sgij.desgloseoperadortipojuego (hjid)
alter table sgij.registrocjt add constraint FKieicrcxtd7bkr04l1mprq7ojw foreign key (participaciondevolucion_regi_2) references sgij.desgloseoperadortipojuego (hjid)
alter table sgij.registrocjt add constraint FK9v74arfs4os2oku3w08d1adok foreign key (premios_registrocjt_hjid) references sgij.desgloseoperadortipojuego (hjid)
alter table sgij.registrocjt add constraint FKjrxbeig1ki5bip6yybd69u9ca foreign key (premiosespecie_registrocjt_h_0) references sgij.desgloseoperadortipojuego (hjid)
alter table sgij.registrocjt add constraint FK5eje7817uha27er3vmtdpyd5w foreign key (retiradas_registrocjt_hjid) references sgij.desglosemediopago (hjid)
alter table sgij.registrocjt add constraint FKq96udkqh34mw4hcvtgdydq4in foreign key (saldofinal_registrocjt_hjid) references sgij.importe (hjid)
alter table sgij.registrocjt add constraint FKq5utmo3qctaqiyykoand2xlyl foreign key (saldoinicial_registrocjt_hjid) references sgij.importe (hjid)
alter table sgij.registrocjt add constraint FK5p8d10tn9khg23igrgc54mgti foreign key (transin_registrocjt_hjid) references sgij.desgloseoperador (hjid)
alter table sgij.registrocjt add constraint FKpw2m8yy94qf4860e7g95konrg foreign key (transout_registrocjt_hjid) references sgij.desgloseoperador (hjid)
alter table sgij.registrocjt add constraint FKhjd9fksfmw571t3tjnf4h4bn9 foreign key (hjid) references sgij.registroperiodicobase (hjid)
alter table sgij.registroconcurso add constraint FK8pw019lvybfp6kompqkj658qf foreign key (hjid) references sgij.registrojut (hjid)
alter table sgij.registrojua add constraint FKmfk4j04mk3b2gbl8h98kcf3fq foreign key (hjid) references sgij.registromensualbase (hjid)
alter table sgij.registrojuaeventoidandticket_0 add constraint FKetluv1rrf2thfaqer4uwk61gw foreign key (itemid_registrojuaeventoidan_0) references sgij.id (hjid)
alter table sgij.registrojuaeventoidandticket_0 add constraint FKa06j2p1o6q3hoxxqvsatprlrv foreign key (itemimporteajuste_registroju_0) references sgij.importe (hjid)
alter table sgij.registrojuaeventoidandticket_0 add constraint FK7qfihqs30wlxpfpi7krvu4tjq foreign key (eventoidandticketapuestaandi_1) references sgij.registrojua (hjid)
alter table sgij.registrojud add constraint FKh8ln9wrxg5cs6nr6fjwk63421 foreign key (hjid) references sgij.registrobase (hjid)
alter table sgij.registrojut add constraint FKp7p5p9p21dc8u3ve4ds4vgpkt foreign key (totales_registrojut_hjid) references sgij.totales (hjid)
alter table sgij.registrojut add constraint FKhr85r23fjxyv8ihkgwhv35nog foreign key (hjid) references sgij.registrobase (hjid)
alter table sgij.registroloteria add constraint FKbviqqagp0mknl9wyx1lw6705y foreign key (hjid) references sgij.registrojut (hjid)
alter table sgij.registromensualbase add constraint FKbxgrdvwh51899sbfeavxdc46r foreign key (hjid) references sgij.registrobase (hjid)
alter table sgij.registroopt add constraint FK5trviki93k45pwcivohqtj67k foreign key (ggr_registroopt_hjid) references sgij.importe (hjid)
alter table sgij.registroopt add constraint FKs54uqmtgyitbh4c6xsxuqvem3 foreign key (ajustesred_registroopt_hjid) references sgij.desgloseoperador (hjid)
alter table sgij.registroopt add constraint FK639idk977acn7mjga2ketubya foreign key (botes_registroopt_hjid) references sgij.desgloseoperador (hjid)
alter table sgij.registroopt add constraint FK3k8ybxbjsf4e5vbu4cffljugj foreign key (comision_registroopt_hjid) references sgij.desgloseoperador (hjid)
alter table sgij.registroopt add constraint FKm6g902bdj4utgvbj8ji665pxs foreign key (otros_registroopt_hjid) references sgij.desgloseoperadorconcepto (hjid)
alter table sgij.registroopt add constraint FKq1q3t2blkb6k35emqiyncvm3x foreign key (participacion_registroopt_hj_0) references sgij.desgloseoperador (hjid)
alter table sgij.registroopt add constraint FKospkmmsm0naaop6p24hnktyp3 foreign key (participaciondevolucion_regi_0) references sgij.desgloseoperador (hjid)
alter table sgij.registroopt add constraint FKhurev26npjsb14ettkfeh7hfk foreign key (premios_registroopt_hjid) references sgij.desgloseoperador (hjid)
alter table sgij.registroopt add constraint FKhkijyg4wbcmbh8chhj3fkbgra foreign key (premiosespecie_registroopt_h_0) references sgij.desgloseoperador (hjid)
alter table sgij.registroopt add constraint FK6s1bhliojh5lc6rb0t6hs8oxx foreign key (hjid) references sgij.registromensualbase (hjid)
alter table sgij.registroort add constraint FK7inh5urhptg2r5uu6l2cr3yxy foreign key (ggr_registroort_hjid) references sgij.importe (hjid)
alter table sgij.registroort add constraint FKf5snvie8h06d4uuv0mabwck4m foreign key (ajustesred_registroort_hjid) references sgij.desgloseoperador (hjid)
alter table sgij.registroort add constraint FKef7uvqstow9ejyum65t4pqrff foreign key (botes_registroort_hjid) references sgij.desgloseoperador (hjid)
alter table sgij.registroort add constraint FK2mpqeivtc8gp4d910jialcgxw foreign key (comision_registroort_hjid) references sgij.desgloseoperador (hjid)
alter table sgij.registroort add constraint FK17fpmx1k5fhkwl35iruok4dtu foreign key (otros_registroort_hjid) references sgij.desgloseoperadorconcepto (hjid)
alter table sgij.registroort add constraint FK1w3f86opdri0ff4gftgaycwot foreign key (participacion_registroort_hj_0) references sgij.desgloseoperador (hjid)
alter table sgij.registroort add constraint FKb2lwcfujmk6s6uk0dvrq3xmrw foreign key (participaciondevolucion_regi_1) references sgij.desgloseoperador (hjid)
alter table sgij.registroort add constraint FK3bms59rcp67mu04af5x3nr8nj foreign key (premios_registroort_hjid) references sgij.desgloseoperador (hjid)
alter table sgij.registroort add constraint FK5pyy9nr7xl5dbe8wv95gcnrtl foreign key (premiosespecie_registroort_h_0) references sgij.desgloseoperador (hjid)
alter table sgij.registroort add constraint FKk3ekkc0hbt62cali45gc1y5kr foreign key (hjid) references sgij.registromensualbase (hjid)
alter table sgij.registroperiodicobase add constraint FKloyajd6nm6aan9ote38fq2rds foreign key (periodo_registroperiodicobas_0) references sgij.periodo_0 (hjid)
alter table sgij.registroperiodicobase add constraint FKa35hhmml9j58yfcbq29ypta9k foreign key (hjid) references sgij.registrobase (hjid)
alter table sgij.registropokercash add constraint FKq7q17qtpu48awq18ubwqodfhp foreign key (hjid) references sgij.registrojut (hjid)
alter table sgij.registropokertorneo add constraint FKs92o8nio0okg63nxl5hyfrv3j foreign key (hjid) references sgij.registrojut (hjid)
alter table sgij.registropuntobanca add constraint FKix72bcsrnb92wf779gx93j1b5 foreign key (hjid) references sgij.registrojut (hjid)
alter table sgij.registrorud add constraint FKg5by6l4q4dqtaj1wgcy36dbgv foreign key (hjid) references sgij.registroperiodicobase (hjid)
alter table sgij.registrorug add constraint FKnfptevhcdtvih95s6y9nfoxro foreign key (hjid) references sgij.registromensualbase (hjid)
alter table sgij.registrorur add constraint FKtjdvhy7j0d9d4eal6cniy3t8o foreign key (hjid) references sgij.registromensualbase (hjid)
alter table sgij.registrorut add constraint FKswglbof0v0a752t6bhg2p5xu9 foreign key (hjid) references sgij.registroperiodicobase (hjid)
alter table sgij.registrosesion add constraint FKhb23oqmy7lxch7i7dxun0vl7u foreign key (hjid) references sgij.registrojut (hjid)
alter table sgij.totales add constraint FK5u3jcl4f4ysjvf2618csryjcx foreign key (botes_totales_hjid) references sgij.botes (hjid)
alter table sgij.totales add constraint FKeb8p58k9eglb5mxgaq2jlxeq foreign key (participacion_totales_hjid) references sgij.desgloseoperador (hjid)
alter table sgij.totales add constraint FKadqnwgmooslnr0w4va50ir9ul foreign key (participaciondevolucion_tota_0) references sgij.desgloseoperador (hjid)
alter table sgij.totales add constraint FKmp5sfq4snkduxjrac775rqbvu foreign key (premios_totales_hjid) references sgij.desgloseoperador (hjid)
alter table sgij.totales add constraint FK7cmf6ct9beh18hhfe1w5u2vp9 foreign key (premiosespecie_totales_hjid) references sgij.desgloseoperador (hjid)
alter table jugador_0_pseudonimo add constraint FK1fju9k5uq3gvihpwe2ddcrhvd foreign key (hjid) references sgij.jugador_0 (hjid)
