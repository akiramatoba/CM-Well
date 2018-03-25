/**
  * Copyright 2015 Thomson Reuters
  *
  * Licensed under the Apache License, Version 2.0 (the “License”); you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  *
  *   http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
  * an “AS IS” BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  *
  * See the License for the specific language governing permissions and
  * limitations under the License.
  */
import javax.inject._
import play.api.http.DefaultHttpFilters
import play.filters.gzip.GzipFilter
import filters._

class Filters @Inject()(gatt: GeneralAttributesFilter,
                        gzip: GzipFilter,
                        alog: AccessLoggingFilter,
                        acin: AddCharsetIfNotExistFilter,
                        afpa: AddFormatParameterIfOnlyAcceptHeaderProvidedFilter,
                        auth: AuthFilter,
                        hdrs: HeadersFilter,
                        trsf: TrafficShapingFilter)
    extends DefaultHttpFilters(gatt, gzip, alog, acin, afpa, auth, hdrs, trsf)
