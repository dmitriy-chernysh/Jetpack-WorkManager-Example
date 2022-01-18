/*
 * Copyright 2021 | Dmitri Chernysh | http://mobile-dev.pro
 *
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.mobiledevpro.alertlog.domain.interactor

import com.mobiledevpro.alertlog.domain.model.StockAlert
import com.mobiledevpro.alertlog.domain.usecase.GetAlertLogUseCase
import com.mobiledevpro.rx.RxResult
import com.mobiledevpro.rx.toViewResult
import io.reactivex.Observable

/**
 * Interactor for Alert Log screen
 *
 * Created on Jan 17, 2022.
 *
 */
class ImplAlertLogInteractor(
    private val getAlertLogUseCase: GetAlertLogUseCase
) : AlertLogInteractor {

    override fun get(): Observable<RxResult<List<StockAlert>>> =
        getAlertLogUseCase.execute()
            .toViewResult()
}