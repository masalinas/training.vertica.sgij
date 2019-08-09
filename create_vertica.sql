create table sgij.botes (hjid int not null, total_botes_hjid int, primary key (hjid))
create table sgij.botes_0 (hjid int not null, movimientos_botes_0_hjid int, saldofinal_botes_0_hjid int, saldoinicial_botes_0_hjid int, primary key (hjid))
create table sgij.cruces (hjid int not null, layback varchar(255), ticket varchar(255), cruces_desglosecruzadas_hjid int, primary key (hjid))
create table sgij.cuentas (hjid int not null, cuenta varchar(255), saldofinal_cuentas_hjid int, cuentas_jugador_hjid int, primary key (hjid))
create table sgij.desglose (hjid int not null, botedesc varchar(255), boteid varchar(255), movimiento_desglose_hjid int, desglose_botes_hjid int, primary key (hjid))
create table sgij.desglose_0 (hjid int not null, operadorid varchar(255), tipojuego varchar(255), importe_desglose_0_hjid int, desglose_desgloseoperadortip_0 int, primary key (hjid))
create table sgij.desglose_1 (hjid int not null, operadorid varchar(255), importe_desglose_1_hjid int, desglose_desgloseoperador_hj_0 int, primary key (hjid))
create table sgij.desglose_2 (hjid int not null, concepto varchar(255), operadorid varchar(255), importe_desglose_2_hjid int, desglose_desgloseoperadorcon_0 int, primary key (hjid))
create table sgij.desglose_3 (hjid int not null, importe numeric(20,2), mediopago varchar(255), otrotipoespecificar varchar(255), tipomediopago varchar(255), desglose_desglosemediopago_h_0 int, primary key (hjid))
create table sgij.desglosebotes (hjid int not null, botedesc varchar(255), boteid varchar(255), fechafin varchar(255), fechainicio varchar(255), movimientos_desglosebotes_hj_0 int, saldofinal_desglosebotes_hjid int, saldoinicial_desglosebotes_h_0 int, desglosebotes_botes_0_hjid int, primary key (hjid))
create table sgij.desglosecompromiso (hjid int not null, fecha varchar(255), saldofinal_desglosecompromis_0 int, desglosecompromiso_partidasv_0 int, primary key (hjid))
create table sgij.desglosecruzadas (hjid int not null, reto varchar(255), desglosecruzadas_jugador_1_h_0 int, primary key (hjid))
create table sgij.desgloseespecie (hjid int not null, descripcion varchar(255), valoracion_desgloseespecie_h_0 int, desgloseespecie_jugador_1_hj_0 int, primary key (hjid))
create table sgij.desglosemediopago (hjid int not null, total numeric(20,2), primary key (hjid))
create table sgij.desgloseoperaciones (hjid int not null, total numeric(20,2), primary key (hjid))
create table sgij.desgloseoperador (hjid int not null, total_desgloseoperador_hjid int, primary key (hjid))
create table sgij.desgloseoperadorconcepto (hjid int not null, total_desgloseoperadorconcep_0 int, primary key (hjid))
create table sgij.desgloseoperadortipojuego (hjid int not null, total_desgloseoperadortipoju_0 int, primary key (hjid))
create table sgij.domicilio (hjid int not null, cp varchar(255), ciudad varchar(255), direccion varchar(255), pais varchar(255), primary key (hjid))
create table sgij.domicilio_0 (hjid int not null, cp varchar(255), ciudad varchar(255), direccion varchar(255), pais varchar(255), primary key (hjid))
create table sgij.estado (hjid int not null, estadocnj varchar(255), estadooperador varchar(255), primary key (hjid))
create table sgij.estado_0 (hjid int not null, estadocnj varchar(255), estadooperador varchar(255), primary key (hjid))
create table sgij.eventos (hjid int not null, eventoid varchar(255), fechahecho varchar(255), hecho varchar(255), eventos_registroapuesta_hjid int, primary key (hjid))
create table sgij.historico (hjid int not null, desde varchar(255), estadocnj varchar(255), estadooperador varchar(255), historico_estado_hjid int, primary key (hjid))
create table sgij.id (hjid int not null, jugadorid varchar(255), operadorid varchar(255), id_jugador_0_hjid int, id_jugador_3_hjid int, id_jugador_2_hjid int, id_jugador_hjid int, primary key (hjid))
create table sgij.importe (hjid int not null, primary key (hjid))
create table sgij.jugador (hjid int not null, ajustepremios_jugador_hjid int, bonos_jugador_hjid int, comision_jugador_hjid int, depositos_jugador_hjid int, otros_jugador_hjid int, participacion_jugador_hjid int, participaciondevolucion_juga_0 int, premios_jugador_hjid int, premiosespecie_jugador_hjid int, retiradas_jugador_hjid int, saldofinal_jugador_hjid int, saldoinicial_jugador_hjid int, transin_jugador_hjid int, transout_jugador_hjid int, jugador_registrocjd_hjid int, primary key (hjid))
create table sgij.jugador_0 (hjid int not null, fvdocumental varchar(255), fvsvdi varchar(255), vdocumental varchar(255), vsvdi varchar(255), apellido1 varchar(255), apellido2 varchar(255), cambiosendatos varchar(255), email varchar(255), fechaactivacion varchar(255), fechanacimiento varchar(255), login varchar(255), nombre varchar(255), regionfiscal varchar(255), sexo varchar(255), telefono varchar(255), domicilio_jugador_0_hjid int, estado_jugador_0_hjid int, limitesdeposito_jugador_0_hj_0 int, noresidente_jugador_0_hjid int, residente_jugador_0_hjid int, jugador_registrorud_hjid int, primary key (hjid))
create table sgij.jugador_1 (hjid int not null, ip varchar(255), cuota numeric(20,10), dispositivo varchar(255), fechaapuesta varchar(255), iddispositivo varchar(255), ticketapuesta varchar(255), id_jugador_1_hjid int, participacion_jugador_1_hjid int, participaciondevolucion_juga_1 int, planificacionazar_jugador_1__0 int, premios_jugador_1_hjid int, premiosespecie_jugador_1_hjid int, jugador_registrojud_hjid int, primary key (hjid))
create table sgij.jugador_2 (hjid int not null, fechaactivacion varchar(255), login varchar(255), estado_jugador_2_hjid int, jugador_registrorur_hjid int, primary key (hjid))
create table sgij.jugador_3 (hjid int not null, fvdocumental varchar(255), fvsvdi varchar(255), vdocumental varchar(255), vsvdi varchar(255), apellido1 varchar(255), apellido2 varchar(255), email varchar(255), fechanacimiento varchar(255), nombre varchar(255), premio numeric(20,10), regionfiscal varchar(255), retencion numeric(20,10), sexo varchar(255), telefono varchar(255), domicilio_jugador_3_hjid int, noresidente_jugador_3_hjid int, residente_jugador_3_hjid int, jugador_registrorug_hjid int, primary key (hjid))
create table sgij.limitesdeposito (hjid int not null, diario numeric(20,2), mensual numeric(20,2), semanal numeric(20,2), primary key (hjid))
create table sgij.linea (hjid int not null, cantidad numeric(20,10), unidad varchar(255), linea_importe_hjid int, primary key (hjid))
create table sgij.lote (hjid int not null, anyobject clob, cabecera_lote_hjid int, primary key (hjid))
create table sgij.lotecabecera (hjid int not null, almacenid varchar(255), loteid varchar(255), operadorid varchar(255), version_ varchar(255), primary key (hjid))
create table sgij.noresidente (hjid int not null, documento varchar(255), especificartipodocumento varchar(255), nacionalidad varchar(255), paisresidencia varchar(255), tipodocumento varchar(255), primary key (hjid))
create table sgij.noresidente_0 (hjid int not null, documento varchar(255), especificartipodocumento varchar(255), nacionalidad varchar(255), paisresidencia varchar(255), tipodocumento varchar(255), primary key (hjid))
create table sgij.numerojugadoresporestado (hjid int not null, estadocnj varchar(255), estadooperador varchar(255), numero numeric(20,0), numerojugadoresporestado_reg_0 int, primary key (hjid))
create table sgij.operaciones (hjid int not null, ip varchar(255), dispositivo varchar(255), fecha varchar(255), iddispositivo varchar(255), importe numeric(20,2), mediopago varchar(255), otrotipoespecificar varchar(255), tipomediopago varchar(255), operaciones_desgloseoperacio_0 int, primary key (hjid))
create table sgij.partidasvivas (hjid int not null, movimientos_partidasvivas_hj_0 int, saldofinal_partidasvivas_hjid int, saldoinicial_partidasvivas_h_0 int, primary key (hjid))
create table sgij.periodo (hjid int not null, primary key (hjid))
create table sgij.periodo_0 (dia varchar(255), mes varchar(255), hjid int not null, primary key (hjid))
create table sgij.planificacionazar (hjid int not null, duracionlimite varchar(255), participacionlimite numeric(20,2), primary key (hjid))
create table sgij.rectificacion (hjid int not null, registrofecha varchar(255), registroid varchar(255), primary key (hjid))
create table sgij.registroanulador (hjid int not null, primary key (hjid))
create table sgij.registroapuesta (endirecto varchar(255), numeroapostantes numeric(20,0), numeroeventos numeric(20,0), tipoapuesta varchar(255), hjid int not null, primary key (hjid))
create table sgij.registrobase (hjid int not null, cabecera_registrobase_hjid int, registro_lote_hjid int, primary key (hjid))
create table sgij.registrobingo (preciocarton numeric(20,2), hjid int not null, primary key (hjid))
create table sgij.registrobot (tipojuego varchar(255), hjid int not null, botes_registrobot_hjid int, partidasvivas_registrobot_hj_0 int, primary key (hjid))
create table sgij.registrocabecera (hjid int not null, almacenid varchar(255), fecha varchar(255), operadorid varchar(255), registroid varchar(255), subregistroid numeric(20,0), subregistrototal numeric(20,0), rectificacion_registrocabece_0 int, primary key (hjid))
create table sgij.registrocevdm (hjid int not null, primary key (hjid))
create table sgij.registrocevdmeventoidanddesc_0 (hjid int not null, itemactualizado varchar(255), itemcompeticion varchar(255), itemdeporte varchar(255), itemdescripcionevento varchar(255), itemeventoid varchar(255), itemfechafin varchar(255), itemfechainicio varchar(255), itemotrodeporteespecificar varchar(255), itemtipoevento varchar(255), eventoidanddescripcionevento_1 int, primary key (hjid))
create table sgij.registrocjd (hjid int not null, primary key (hjid))
create table sgij.registrocjt (hjid int not null, ajustepremios_registrocjt_hj_0 int, bonos_registrocjt_hjid int, comision_registrocjt_hjid int, depositos_registrocjt_hjid int, otros_registrocjt_hjid int, participacion_registrocjt_hj_0 int, participaciondevolucion_regi_2 int, premios_registrocjt_hjid int, premiosespecie_registrocjt_h_0 int, retiradas_registrocjt_hjid int, saldofinal_registrocjt_hjid int, saldoinicial_registrocjt_hjid int, transin_registrocjt_hjid int, transout_registrocjt_hjid int, primary key (hjid))
create table sgij.registroconcurso (stallamadas numeric(20,2), stasms numeric(20,2), importemaximollamada numeric(20,2), numerollamadas numeric(20,0), numeroparticipaciones numeric(20,0), numeropremiados numeric(20,0), numerosms numeric(20,0), participacionllamadas numeric(20,2), participacionsms numeric(20,2), preciominutollamada numeric(20,2), preciosms numeric(20,2), hjid int not null, primary key (hjid))
create table sgij.registrojua (hjid int not null, primary key (hjid))
create table sgij.registrojuaeventoidandticket_0 (hjid int not null, itemeventoid varchar(255), itemfechaajuste varchar(255), itemmotivoajuste varchar(255), itemticketapuesta varchar(255), itemid_registrojuaeventoidan_0 int, itemimporteajuste_registroju_0 int, eventoidandticketapuestaandi_1 int, primary key (hjid))
create table sgij.registrojud (fechafin varchar(255), juegoid varchar(255), hjid int not null, primary key (hjid))
create table sgij.registrojut (booleanli varchar(255), fechafin varchar(255), fechainicio varchar(255), juegoaplazado varchar(255), juegocancelado varchar(255), juegodesc varchar(255), juegoenred varchar(255), juegoid varchar(255), juegosuspendido varchar(255), tipojuego varchar(255), hjid int not null, totales_registrojut_hjid int, primary key (hjid))
create table sgij.registroloteria (numeroapostantes numeric(20,0), hjid int not null, primary key (hjid))
create table sgij.registromensualbase (mes varchar(255), hjid int not null, primary key (hjid))
create table sgij.registroopt (tipojuego varchar(255), hjid int not null, ggr_registroopt_hjid int, ajustesred_registroopt_hjid int, botes_registroopt_hjid int, comision_registroopt_hjid int, otros_registroopt_hjid int, participacion_registroopt_hj_0 int, participaciondevolucion_regi_0 int, premios_registroopt_hjid int, premiosespecie_registroopt_h_0 int, primary key (hjid))
create table sgij.registroort (tipojuego varchar(255), hjid int not null, ggr_registroort_hjid int, ajustesred_registroort_hjid int, botes_registroort_hjid int, comision_registroort_hjid int, otros_registroort_hjid int, participacion_registroort_hj_0 int, participaciondevolucion_regi_1 int, premios_registroort_hjid int, premiosespecie_registroort_h_0 int, primary key (hjid))
create table sgij.registroperiodicobase (periodicidad varchar(255), hjid int not null, periodo_registroperiodicobas_0 int, primary key (hjid))
create table sgij.registropokercash (mesaid varchar(255), variante varchar(255), variantecomercial varchar(255), hjid int not null, primary key (hjid))
create table sgij.registropokertorneo (numeroparticipantes numeric(20,0), variante varchar(255), variantecomercial varchar(255), hjid int not null, primary key (hjid))
create table sgij.registropuntobanca (hjid int not null, primary key (hjid))
create table sgij.registrorud (hjid int not null, primary key (hjid))
create table sgij.registrorug (hjid int not null, primary key (hjid))
create table sgij.registrorur (hjid int not null, primary key (hjid))
create table sgij.registrorut (numeroactividad numeric(20,0), numeroaltas numeric(20,0), numerobajas numeric(20,0), numerojugadores numeric(20,0), hjid int not null, primary key (hjid))
create table sgij.registrosesion (partidasjugadas numeric(20,0), variante varchar(255), variantecomercial varchar(255), hjid int not null, primary key (hjid))
create table sgij.residente (hjid int not null, dni varchar(255), nie varchar(255), nacionalidad varchar(255), primary key (hjid))
create table sgij.residente_0 (hjid int not null, dni varchar(255), nie varchar(255), nacionalidad varchar(255), primary key (hjid))
create table sgij.totales (hjid int not null, botes_totales_hjid int, participacion_totales_hjid int, participaciondevolucion_tota_0 int, premios_totales_hjid int, premiosespecie_totales_hjid int, primary key (hjid))
create sequence hibernate_sequence start with 1 increment by 1
create table jugador_0_pseudonimo (hjid int not null, hjvalue varchar(255), hjindex int not null, primary key (hjid, hjindex))
create table product_dimension (product_key int not null, product_version int not null, discontinued_flag TINYINT(1), product_description varchar(255), product_price float4, primary key (product_key, product_version))
alter table sgij.botes add constraint FK2b0lu47ow54l2blnrblklx5sw foreign key (total_botes_hjid) references sgij.importe
alter table sgij.botes_0 add constraint FKfntj9m3ydu17e3kiukhb71a6 foreign key (movimientos_botes_0_hjid) references sgij.importe
alter table sgij.botes_0 add constraint FK8w25pbfct4nac0yfhwanegt0 foreign key (saldofinal_botes_0_hjid) references sgij.importe
alter table sgij.botes_0 add constraint FKno9ow1gl7k6676sh8xx5l16nu foreign key (saldoinicial_botes_0_hjid) references sgij.importe
alter table sgij.cruces add constraint FK4hjca3561ihue2ikccu7mlan foreign key (cruces_desglosecruzadas_hjid) references sgij.desglosecruzadas
alter table sgij.cuentas add constraint FKc5fu9hu30t9uwutjrtru15eay foreign key (saldofinal_cuentas_hjid) references sgij.importe
alter table sgij.cuentas add constraint FK57n5avv2d28akr6amlqic6sw8 foreign key (cuentas_jugador_hjid) references sgij.jugador
alter table sgij.desglose add constraint FKa2iewfkq1xbm5wyrxtt7ruu5t foreign key (movimiento_desglose_hjid) references sgij.importe
alter table sgij.desglose add constraint FKqrcevhucjomwjnvu7dsw928e5 foreign key (desglose_botes_hjid) references sgij.botes
alter table sgij.desglose_0 add constraint FKb1avc4q0pt1xyl2xsc3pnjxtt foreign key (importe_desglose_0_hjid) references sgij.importe
alter table sgij.desglose_0 add constraint FKsuwb5ayw8vqxfjmmnuhg76294 foreign key (desglose_desgloseoperadortip_0) references sgij.desgloseoperadortipojuego
alter table sgij.desglose_1 add constraint FK3nu2bwncdxu4kk9l4poak1jn0 foreign key (importe_desglose_1_hjid) references sgij.importe
alter table sgij.desglose_1 add constraint FKbsqhttkncwueekgd99t82edgy foreign key (desglose_desgloseoperador_hj_0) references sgij.desgloseoperador
alter table sgij.desglose_2 add constraint FKjn19g20ln7dmv7q85kjbp9eq0 foreign key (importe_desglose_2_hjid) references sgij.importe
alter table sgij.desglose_2 add constraint FK9779n5au0mvin1vrkyaup0o7f foreign key (desglose_desgloseoperadorcon_0) references sgij.desgloseoperadorconcepto
alter table sgij.desglose_3 add constraint FKeyfu2jrja9mwv23g78rsi8sv7 foreign key (desglose_desglosemediopago_h_0) references sgij.desglosemediopago
alter table sgij.desglosebotes add constraint FKmopc110bpw0s5ha5gpq3xg52x foreign key (movimientos_desglosebotes_hj_0) references sgij.importe
alter table sgij.desglosebotes add constraint FKr852aa9wp8ag8ldrwaw063kn3 foreign key (saldofinal_desglosebotes_hjid) references sgij.importe
alter table sgij.desglosebotes add constraint FKloh4ehv5pj0w06nuxfsx7y3qi foreign key (saldoinicial_desglosebotes_h_0) references sgij.importe
alter table sgij.desglosebotes add constraint FKrywtwu1lob6bshe5pi0ms362l foreign key (desglosebotes_botes_0_hjid) references sgij.botes_0
alter table sgij.desglosecompromiso add constraint FK2vjoutel2ls3rolv3lgkd2804 foreign key (saldofinal_desglosecompromis_0) references sgij.importe
alter table sgij.desglosecompromiso add constraint FKhf67m9t87q4r5f4s6yttaasrg foreign key (desglosecompromiso_partidasv_0) references sgij.partidasvivas
alter table sgij.desglosecruzadas add constraint FK8wj1aonk6n1og4iwojvaiaws6 foreign key (desglosecruzadas_jugador_1_h_0) references sgij.jugador_1
alter table sgij.desgloseespecie add constraint FKdri5kx5aegk8pdfoe24592msy foreign key (valoracion_desgloseespecie_h_0) references sgij.importe
alter table sgij.desgloseespecie add constraint FK1o6eo4bdw1cbkv4gj0yqkkvua foreign key (desgloseespecie_jugador_1_hj_0) references sgij.jugador_1
alter table sgij.desgloseoperador add constraint FK1l5oe2jr7xdwodvcxa76wfeip foreign key (total_desgloseoperador_hjid) references sgij.importe
alter table sgij.desgloseoperadorconcepto add constraint FKoloicqodf67fjga04uef49mfj foreign key (total_desgloseoperadorconcep_0) references sgij.importe
alter table sgij.desgloseoperadortipojuego add constraint FKtl0q5ptgm8pgin76wem3laer3 foreign key (total_desgloseoperadortipoju_0) references sgij.importe
alter table sgij.eventos add constraint FKk451pw9d1iyuro4ybljdn3s2v foreign key (eventos_registroapuesta_hjid) references sgij.registroapuesta
alter table sgij.historico add constraint FKhwsc8bu9oet9fsutd4vye3eb0 foreign key (historico_estado_hjid) references sgij.estado
alter table sgij.id add constraint FKxxydj995t3nfm0hre4jjkuq7 foreign key (id_jugador_0_hjid) references sgij.jugador_0
alter table sgij.id add constraint FKhj4lvbukwwpa5ykjc6lgbmtkn foreign key (id_jugador_3_hjid) references sgij.jugador_3
alter table sgij.id add constraint FKgvyc4ijf99538nuwng44cxlg8 foreign key (id_jugador_2_hjid) references sgij.jugador_2
alter table sgij.id add constraint FKt1mg4ya79lkpnoxh4dykjke9w foreign key (id_jugador_hjid) references sgij.jugador
alter table sgij.jugador add constraint FKthsqnt0aw67r132smjyywl2bm foreign key (ajustepremios_jugador_hjid) references sgij.desgloseoperadortipojuego
alter table sgij.jugador add constraint FKgsvt2ayp1mx72nps9ryy9273m foreign key (bonos_jugador_hjid) references sgij.desgloseoperadorconcepto
alter table sgij.jugador add constraint FKiwmc5g3nct3crvu3y7upgw0l5 foreign key (comision_jugador_hjid) references sgij.desgloseoperadortipojuego
alter table sgij.jugador add constraint FKj1yw8rslsf1kw3421si0nowgq foreign key (depositos_jugador_hjid) references sgij.desgloseoperaciones
alter table sgij.jugador add constraint FKp39og10642a82nhwdjmbbskm8 foreign key (otros_jugador_hjid) references sgij.desgloseoperadorconcepto
alter table sgij.jugador add constraint FK4wrkwsnvm9bci0dbvxop86nde foreign key (participacion_jugador_hjid) references sgij.desgloseoperadortipojuego
alter table sgij.jugador add constraint FKm6652tvpgr0jv9wuia3asxih2 foreign key (participaciondevolucion_juga_0) references sgij.desgloseoperadortipojuego
alter table sgij.jugador add constraint FKsu5p9bw464pquc0q1gxj1w534 foreign key (premios_jugador_hjid) references sgij.desgloseoperadortipojuego
alter table sgij.jugador add constraint FKh1bo77966ir9vtgj587k7isv5 foreign key (premiosespecie_jugador_hjid) references sgij.desgloseoperadortipojuego
alter table sgij.jugador add constraint FKihbycf6m69tvq16s0996bux42 foreign key (retiradas_jugador_hjid) references sgij.desgloseoperaciones
alter table sgij.jugador add constraint FKft8s3db1p9824ws39ke2stjyc foreign key (saldofinal_jugador_hjid) references sgij.importe
alter table sgij.jugador add constraint FK8jsq2y3uni8jckn561ohxr8kw foreign key (saldoinicial_jugador_hjid) references sgij.importe
alter table sgij.jugador add constraint FK9enh05mcxki5wrwragjxi8y3b foreign key (transin_jugador_hjid) references sgij.desgloseoperador
alter table sgij.jugador add constraint FKh6cyxf0vsbhhv2w5j858o68p6 foreign key (transout_jugador_hjid) references sgij.desgloseoperador
alter table sgij.jugador add constraint FK3bxbfavcidh06keae21gebp9 foreign key (jugador_registrocjd_hjid) references sgij.registrocjd
alter table sgij.jugador_0 add constraint FKjlw6vpq91ld5qp9okcfhjgmm3 foreign key (domicilio_jugador_0_hjid) references sgij.domicilio
alter table sgij.jugador_0 add constraint FKsp6biq5cv5o3fa47fdeh73y54 foreign key (estado_jugador_0_hjid) references sgij.estado
alter table sgij.jugador_0 add constraint FKbvr04bsbfw54c98fh0wwitxer foreign key (limitesdeposito_jugador_0_hj_0) references sgij.limitesdeposito
alter table sgij.jugador_0 add constraint FKlb0c9yl4qjj3sc3oiktud25pp foreign key (noresidente_jugador_0_hjid) references sgij.noresidente
alter table sgij.jugador_0 add constraint FKlyjfxhf7jw7k5jx51v60yluew foreign key (residente_jugador_0_hjid) references sgij.residente
alter table sgij.jugador_0 add constraint FK50igtore58d4y2n8n0xdtno2b foreign key (jugador_registrorud_hjid) references sgij.registrorud
alter table sgij.jugador_1 add constraint FK6dfr5c99k4skpsrmewoie0vjd foreign key (id_jugador_1_hjid) references sgij.id
alter table sgij.jugador_1 add constraint FKhiqco9s01w855onhv2kd9dmyo foreign key (participacion_jugador_1_hjid) references sgij.importe
alter table sgij.jugador_1 add constraint FK3jc1d86gsk7gdtdqtklujh6dr foreign key (participaciondevolucion_juga_1) references sgij.importe
alter table sgij.jugador_1 add constraint FKq5ae1762fff6j96yk8ioe1yt2 foreign key (planificacionazar_jugador_1__0) references sgij.planificacionazar
alter table sgij.jugador_1 add constraint FKmsjbd31cjcd96j88fvr4rhjh foreign key (premios_jugador_1_hjid) references sgij.importe
alter table sgij.jugador_1 add constraint FK3uaix2wkdll1tw9wfmwpc84hp foreign key (premiosespecie_jugador_1_hjid) references sgij.importe
alter table sgij.jugador_1 add constraint FKmnc89xmh8a3elfqwnlciwya8 foreign key (jugador_registrojud_hjid) references sgij.registrojud
alter table sgij.jugador_2 add constraint FKt2qnf5anj1lnpjc7xffgd2ab5 foreign key (estado_jugador_2_hjid) references sgij.estado_0
alter table sgij.jugador_2 add constraint FKt1fu7xuasa2948ss248xdwrvg foreign key (jugador_registrorur_hjid) references sgij.registrorur
alter table sgij.jugador_3 add constraint FK9uoj5abn8q2d2ukcamj7xar7i foreign key (domicilio_jugador_3_hjid) references sgij.domicilio_0
alter table sgij.jugador_3 add constraint FKrffoi0x6t6vjdjau5gv6yjq2m foreign key (noresidente_jugador_3_hjid) references sgij.noresidente_0
alter table sgij.jugador_3 add constraint FKrstwv897w9qsn8ifr4d1c0k3h foreign key (residente_jugador_3_hjid) references sgij.residente_0
alter table sgij.jugador_3 add constraint FK5t4balik8gsh3b4tpmrb8jrbh foreign key (jugador_registrorug_hjid) references sgij.registrorug
alter table sgij.linea add constraint FK7r44tdc4bvxfytwee7p8mh6lo foreign key (linea_importe_hjid) references sgij.importe
alter table sgij.lote add constraint FKkofd9beqke8bj1cpx967ngg4c foreign key (cabecera_lote_hjid) references sgij.lotecabecera
alter table sgij.numerojugadoresporestado add constraint FKfffh9dy6kpt9ojk6b44bm98jp foreign key (numerojugadoresporestado_reg_0) references sgij.registrorut
alter table sgij.operaciones add constraint FKdtxyp6bk85uv5ys6kv40i6f62 foreign key (operaciones_desgloseoperacio_0) references sgij.desgloseoperaciones
alter table sgij.partidasvivas add constraint FKo19wtvwkns3jmuwpggbij09lg foreign key (movimientos_partidasvivas_hj_0) references sgij.importe
alter table sgij.partidasvivas add constraint FKd4rr6ixtgojxpehm499ti6q5n foreign key (saldofinal_partidasvivas_hjid) references sgij.importe
alter table sgij.partidasvivas add constraint FKbnomr7t6vc6e2few81dna53b9 foreign key (saldoinicial_partidasvivas_h_0) references sgij.importe
alter table sgij.periodo_0 add constraint FKqrf65a4gndoh7x0vvu02swkpg foreign key (hjid) references sgij.periodo
alter table sgij.registroanulador add constraint FKelmugxmvyqw5r3gtuxbhohmcb foreign key (hjid) references sgij.registrobase
alter table sgij.registroapuesta add constraint FKs7dxc974tiukgdc0p5aamounn foreign key (hjid) references sgij.registrojut
alter table sgij.registrobase add constraint FKanflqm1cg0buse3m1s7m0j1k5 foreign key (cabecera_registrobase_hjid) references sgij.registrocabecera
alter table sgij.registrobase add constraint FKfqpn0b3puw05qidk1sp83de77 foreign key (registro_lote_hjid) references sgij.lote
alter table sgij.registrobingo add constraint FK9n5vxa31p2w6nd113cwwhjd1b foreign key (hjid) references sgij.registrojut
alter table sgij.registrobot add constraint FKn40q7cw1qd2mkmlv6qysbmou4 foreign key (botes_registrobot_hjid) references sgij.botes_0
alter table sgij.registrobot add constraint FKm6cr5brissvolupu3rigu3bsh foreign key (partidasvivas_registrobot_hj_0) references sgij.partidasvivas
alter table sgij.registrobot add constraint FKefrm1ches8cycuj0gg0x466ac foreign key (hjid) references sgij.registromensualbase
alter table sgij.registrocabecera add constraint FKgdqjf9rmw1pvc50pt9fwfy49n foreign key (rectificacion_registrocabece_0) references sgij.rectificacion
alter table sgij.registrocevdm add constraint FKg5fy9tbm1l8pc2v35yak2ucn0 foreign key (hjid) references sgij.registroperiodicobase
alter table sgij.registrocevdmeventoidanddesc_0 add constraint FK56we2ggeun6ed7lv3bnt1o7cb foreign key (eventoidanddescripcionevento_1) references sgij.registrocevdm
alter table sgij.registrocjd add constraint FKqmg161eqpqj8wm5h4stwagbm5 foreign key (hjid) references sgij.registroperiodicobase
alter table sgij.registrocjt add constraint FK8syn64sfmvihnfkm4pvhbsshj foreign key (ajustepremios_registrocjt_hj_0) references sgij.desgloseoperadortipojuego
alter table sgij.registrocjt add constraint FKq0yixq7npgqnb5cy7xyhfo4ed foreign key (bonos_registrocjt_hjid) references sgij.desgloseoperadorconcepto
alter table sgij.registrocjt add constraint FKpssfbba5a5m6t4wlochlwio7g foreign key (comision_registrocjt_hjid) references sgij.desgloseoperadortipojuego
alter table sgij.registrocjt add constraint FKqcpwyaq6pra7dkl7lg6rxkiwi foreign key (depositos_registrocjt_hjid) references sgij.desglosemediopago
alter table sgij.registrocjt add constraint FKqforq0amxk4il0pqda7gr2brv foreign key (otros_registrocjt_hjid) references sgij.desgloseoperadorconcepto
alter table sgij.registrocjt add constraint FK5uggil9lt0t8n00gylikceki8 foreign key (participacion_registrocjt_hj_0) references sgij.desgloseoperadortipojuego
alter table sgij.registrocjt add constraint FKieicrcxtd7bkr04l1mprq7ojw foreign key (participaciondevolucion_regi_2) references sgij.desgloseoperadortipojuego
alter table sgij.registrocjt add constraint FK9v74arfs4os2oku3w08d1adok foreign key (premios_registrocjt_hjid) references sgij.desgloseoperadortipojuego
alter table sgij.registrocjt add constraint FKjrxbeig1ki5bip6yybd69u9ca foreign key (premiosespecie_registrocjt_h_0) references sgij.desgloseoperadortipojuego
alter table sgij.registrocjt add constraint FK5eje7817uha27er3vmtdpyd5w foreign key (retiradas_registrocjt_hjid) references sgij.desglosemediopago
alter table sgij.registrocjt add constraint FKq96udkqh34mw4hcvtgdydq4in foreign key (saldofinal_registrocjt_hjid) references sgij.importe
alter table sgij.registrocjt add constraint FKq5utmo3qctaqiyykoand2xlyl foreign key (saldoinicial_registrocjt_hjid) references sgij.importe
alter table sgij.registrocjt add constraint FK5p8d10tn9khg23igrgc54mgti foreign key (transin_registrocjt_hjid) references sgij.desgloseoperador
alter table sgij.registrocjt add constraint FKpw2m8yy94qf4860e7g95konrg foreign key (transout_registrocjt_hjid) references sgij.desgloseoperador
alter table sgij.registrocjt add constraint FKhjd9fksfmw571t3tjnf4h4bn9 foreign key (hjid) references sgij.registroperiodicobase
alter table sgij.registroconcurso add constraint FK8pw019lvybfp6kompqkj658qf foreign key (hjid) references sgij.registrojut
alter table sgij.registrojua add constraint FKmfk4j04mk3b2gbl8h98kcf3fq foreign key (hjid) references sgij.registromensualbase
alter table sgij.registrojuaeventoidandticket_0 add constraint FKetluv1rrf2thfaqer4uwk61gw foreign key (itemid_registrojuaeventoidan_0) references sgij.id
alter table sgij.registrojuaeventoidandticket_0 add constraint FKa06j2p1o6q3hoxxqvsatprlrv foreign key (itemimporteajuste_registroju_0) references sgij.importe
alter table sgij.registrojuaeventoidandticket_0 add constraint FK7qfihqs30wlxpfpi7krvu4tjq foreign key (eventoidandticketapuestaandi_1) references sgij.registrojua
alter table sgij.registrojud add constraint FKh8ln9wrxg5cs6nr6fjwk63421 foreign key (hjid) references sgij.registrobase
alter table sgij.registrojut add constraint FKp7p5p9p21dc8u3ve4ds4vgpkt foreign key (totales_registrojut_hjid) references sgij.totales
alter table sgij.registrojut add constraint FKhr85r23fjxyv8ihkgwhv35nog foreign key (hjid) references sgij.registrobase
alter table sgij.registroloteria add constraint FKbviqqagp0mknl9wyx1lw6705y foreign key (hjid) references sgij.registrojut
alter table sgij.registromensualbase add constraint FKbxgrdvwh51899sbfeavxdc46r foreign key (hjid) references sgij.registrobase
alter table sgij.registroopt add constraint FK5trviki93k45pwcivohqtj67k foreign key (ggr_registroopt_hjid) references sgij.importe
alter table sgij.registroopt add constraint FKs54uqmtgyitbh4c6xsxuqvem3 foreign key (ajustesred_registroopt_hjid) references sgij.desgloseoperador
alter table sgij.registroopt add constraint FK639idk977acn7mjga2ketubya foreign key (botes_registroopt_hjid) references sgij.desgloseoperador
alter table sgij.registroopt add constraint FK3k8ybxbjsf4e5vbu4cffljugj foreign key (comision_registroopt_hjid) references sgij.desgloseoperador
alter table sgij.registroopt add constraint FKm6g902bdj4utgvbj8ji665pxs foreign key (otros_registroopt_hjid) references sgij.desgloseoperadorconcepto
alter table sgij.registroopt add constraint FKq1q3t2blkb6k35emqiyncvm3x foreign key (participacion_registroopt_hj_0) references sgij.desgloseoperador
alter table sgij.registroopt add constraint FKospkmmsm0naaop6p24hnktyp3 foreign key (participaciondevolucion_regi_0) references sgij.desgloseoperador
alter table sgij.registroopt add constraint FKhurev26npjsb14ettkfeh7hfk foreign key (premios_registroopt_hjid) references sgij.desgloseoperador
alter table sgij.registroopt add constraint FKhkijyg4wbcmbh8chhj3fkbgra foreign key (premiosespecie_registroopt_h_0) references sgij.desgloseoperador
alter table sgij.registroopt add constraint FK6s1bhliojh5lc6rb0t6hs8oxx foreign key (hjid) references sgij.registromensualbase
alter table sgij.registroort add constraint FK7inh5urhptg2r5uu6l2cr3yxy foreign key (ggr_registroort_hjid) references sgij.importe
alter table sgij.registroort add constraint FKf5snvie8h06d4uuv0mabwck4m foreign key (ajustesred_registroort_hjid) references sgij.desgloseoperador
alter table sgij.registroort add constraint FKef7uvqstow9ejyum65t4pqrff foreign key (botes_registroort_hjid) references sgij.desgloseoperador
alter table sgij.registroort add constraint FK2mpqeivtc8gp4d910jialcgxw foreign key (comision_registroort_hjid) references sgij.desgloseoperador
alter table sgij.registroort add constraint FK17fpmx1k5fhkwl35iruok4dtu foreign key (otros_registroort_hjid) references sgij.desgloseoperadorconcepto
alter table sgij.registroort add constraint FK1w3f86opdri0ff4gftgaycwot foreign key (participacion_registroort_hj_0) references sgij.desgloseoperador
alter table sgij.registroort add constraint FKb2lwcfujmk6s6uk0dvrq3xmrw foreign key (participaciondevolucion_regi_1) references sgij.desgloseoperador
alter table sgij.registroort add constraint FK3bms59rcp67mu04af5x3nr8nj foreign key (premios_registroort_hjid) references sgij.desgloseoperador
alter table sgij.registroort add constraint FK5pyy9nr7xl5dbe8wv95gcnrtl foreign key (premiosespecie_registroort_h_0) references sgij.desgloseoperador
alter table sgij.registroort add constraint FKk3ekkc0hbt62cali45gc1y5kr foreign key (hjid) references sgij.registromensualbase
alter table sgij.registroperiodicobase add constraint FKloyajd6nm6aan9ote38fq2rds foreign key (periodo_registroperiodicobas_0) references sgij.periodo_0
alter table sgij.registroperiodicobase add constraint FKa35hhmml9j58yfcbq29ypta9k foreign key (hjid) references sgij.registrobase
alter table sgij.registropokercash add constraint FKq7q17qtpu48awq18ubwqodfhp foreign key (hjid) references sgij.registrojut
alter table sgij.registropokertorneo add constraint FKs92o8nio0okg63nxl5hyfrv3j foreign key (hjid) references sgij.registrojut
alter table sgij.registropuntobanca add constraint FKix72bcsrnb92wf779gx93j1b5 foreign key (hjid) references sgij.registrojut
alter table sgij.registrorud add constraint FKg5by6l4q4dqtaj1wgcy36dbgv foreign key (hjid) references sgij.registroperiodicobase
alter table sgij.registrorug add constraint FKnfptevhcdtvih95s6y9nfoxro foreign key (hjid) references sgij.registromensualbase
alter table sgij.registrorur add constraint FKtjdvhy7j0d9d4eal6cniy3t8o foreign key (hjid) references sgij.registromensualbase
alter table sgij.registrorut add constraint FKswglbof0v0a752t6bhg2p5xu9 foreign key (hjid) references sgij.registroperiodicobase
alter table sgij.registrosesion add constraint FKhb23oqmy7lxch7i7dxun0vl7u foreign key (hjid) references sgij.registrojut
alter table sgij.totales add constraint FK5u3jcl4f4ysjvf2618csryjcx foreign key (botes_totales_hjid) references sgij.botes
alter table sgij.totales add constraint FKeb8p58k9eglb5mxgaq2jlxeq foreign key (participacion_totales_hjid) references sgij.desgloseoperador
alter table sgij.totales add constraint FKadqnwgmooslnr0w4va50ir9ul foreign key (participaciondevolucion_tota_0) references sgij.desgloseoperador
alter table sgij.totales add constraint FKmp5sfq4snkduxjrac775rqbvu foreign key (premios_totales_hjid) references sgij.desgloseoperador
alter table sgij.totales add constraint FK7cmf6ct9beh18hhfe1w5u2vp9 foreign key (premiosespecie_totales_hjid) references sgij.desgloseoperador
alter table jugador_0_pseudonimo add constraint FK1fju9k5uq3gvihpwe2ddcrhvd foreign key (hjid) references sgij.jugador_0
